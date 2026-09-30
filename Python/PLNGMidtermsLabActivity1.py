print("--- Starting Campus Service Queue Manager ---")

tickets = []          
next_ticket_id = 1    
priority_streak = 0   

counters = {1: None, 2: None}

V_PURPOSES = ["Enrollment", "Records", "Payment"]
V_TYPES = ["regular", "priority"]

class WaitingTicketIterator:
    def __init__(self, ticket_list):
        self.ticket_list = ticket_list
        self.index = 0

    def __iter__(self):
        return self

    def __next__(self):
        while self.index < len(self.ticket_list):
            current = self.ticket_list[self.index]
            self.index += 1
            if current["status"] == "waiting":
                return current
        raise StopIteration

def issue_ticket(purpose, service_type="regular"):
    global next_ticket_id
    if purpose not in V_PURPOSES:
        raise ValueError(f"Invalid Purpose. Choose from: {V_PURPOSES}")
    if service_type not in V_TYPES:
        raise ValueError(f"Invalid Service Type. Choose from: {V_TYPES}")
    
    ticket = {
        "number": next_ticket_id,
        "purpose": purpose,
        "type": service_type,
        "status": "waiting"
    }
    tickets.append(ticket)
    next_ticket_id += 1
    return ticket["number"]

def issue_many(*requests):
    for purpose, s_type in requests:
        if purpose not in V_PURPOSES or s_type not in V_TYPES:
            raise ValueError("Batch rejected: Contains invalid parameters.")
    
    issued_ids = []
    for purpose, s_type in requests:
        issued_ids.append(issue_ticket(purpose, s_type))
    return issued_ids

def next_ticket(waiting_list, current_streak):
    prio_queue = [t for t in waiting_list if t["type"] == "priority" and t["status"] == "waiting"]
    reg_queue = [t for t in waiting_list if t["type"] == "regular" and t["status"] == "waiting"]

    if not prio_queue and not reg_queue:
        return None, current_streak

    if prio_queue and reg_queue:
        if current_streak >= 2:
            return reg_queue[0], 0  
        else:
            return prio_queue[0], current_streak + 1
    elif prio_queue:
        return prio_queue[0], current_streak + 1
    else:
        return reg_queue[0], 0

def report(**kwargs):
    print("\n--- QUEUE STATUS REPORT ---")
    if kwargs.get("show_waiting", True):
        waiting_count = len([t for t in tickets if t["status"] == "waiting"])
        print(f"Waiting Tickets Count: {waiting_count}")
    if kwargs.get("show_served", True):
        served_count = len([t for t in tickets if t["status"] == "served"])
        print(f"Served Tickets Count:  {served_count}")
    if kwargs.get("show_cancelled", True):
        cancelled_count = len([t for t in tickets if t["status"] == "cancelled"])
        print(f"Cancelled Tickets:     {cancelled_count}")
    if kwargs.get("show_counters", True):
        free_count = sum(1 for c in counters.values() if c is None)
        print(f"Available Free Counters: {free_count}")
    print("---------------------------")

def calculate_estimated_position(target_ticket):
    if target_ticket["status"] != "waiting":
        return 0
    
    sim_list = [dict(t) for t in tickets if t["status"] == "waiting"]
    sim_streak = priority_streak
    position_counter = 1

    while True:
        nxt, sim_streak = next_ticket(sim_list, sim_streak)
        if not nxt:
            return -1 
        if nxt["number"] == target_ticket["number"]:
            return position_counter
        
        for t in sim_list:
            if t["number"] == nxt["number"]:
                t["status"] = "served"
        position_counter += 1

def run_menu():
    global priority_streak
    while True:
        print("\n=== CAMPUS SERVICE QUEUE MANAGER ===")
        print("[1] Issue a Ticket")
        print("[2] Call the Next Ticket")
        print("[3] Complete a Service")
        print("[4] Cancel a Waiting Ticket")
        print("[5] Show Waiting Tickets")
        print("[6] Show Counter Status & Completed History")
        print("[7] Show Summary Report")
        print("[8] Exit Program")
        
        choice = input("Enter selection (1-8): ").strip()
        
        if choice == "1":
            print(f"Purposes: {V_PURPOSES}")
            purpose = input("Enter Purpose: ").strip().capitalize()
            s_type = input("Enter Service Type (regular/priority) [Default=regular]: ").strip().lower()
            if not s_type:
                s_type = "regular"
            try:
                t_num = issue_ticket(purpose, s_type)
                print(f"Success: Ticket #{t_num} has been issued safely.")
            except ValueError as e:
                print(f"Input Error: {e}")

        elif choice == "2":
            free_counter_id = None
            for c_id in sorted(counters.keys()):
                if counters[c_id] is None:
                    free_counter_id = c_id
                    break
            
            if free_counter_id is None:
                print("Error: Action denied. All counters are busy right now.")
                continue

            nxt, priority_streak = next_ticket(tickets, priority_streak)
            if nxt:
                nxt["status"] = "served"
                counters[free_counter_id] = nxt
                print(f"Counter allocation confirmed: Call Ticket #{nxt['number']} ({nxt['type']}) to Counter {free_counter_id}.")
            else:
                print("Notice: No matching waiting tickets found.")

        elif choice == "3":
            try:
                c_id = int(input("Enter Counter ID to complete service (1 or 2): ").strip())
                if c_id not in counters:
                    print("Error: That counter ID does not exist.")
                    continue
                if counters[c_id] is None:
                    print(f"Error: Counter {c_id} is already free.")
                    continue
                
                completed_ticket = counters[c_id]
                counters[c_id] = None
                print(f"Success: Service for Ticket #{completed_ticket['number']} marked complete. Counter {c_id} is now free.")
            except ValueError:
                print("Error: Please provide a valid integer value.")

        elif choice == "4":
            try:
                t_num = int(input("Enter Ticket Number to cancel: ").strip())
                found = False
                for t in tickets:
                    if t["number"] == t_num:
                        found = True
                        if t["status"] == "waiting":
                            t["status"] = "cancelled"
                            print(f"Success: Ticket #{t_num} has been cancelled.")
                        else:
                            print(f"Error: Ticket #{t_num} cannot be cancelled because its current status is '{t['status']}'.")
                if not found:
                    print("Error: Ticket number not found.")
            except ValueError:
                print("Error: Please enter a valid numerical number.")

        elif choice == "5":
            print("\n--- ACTIVE WAITING QUEUE ---")
            iterator = WaitingTicketIterator(tickets)
            count = 1
            for t in iterator:
                pos = calculate_estimated_position(t)
                print(f"Queue Position {count} -> Ticket #{t['number']} [{t['type'].upper()}] - {t['purpose']} (Est. Call Turn: {pos})")
                count += 1
            if count == 1:
                print("No tickets currently waiting in line.")

        elif choice == "6":
            print("\n--- COUNTER ASSIGNMENT STATUS ---")
            for c_id, t in counters.items():
                status_str = f"Ticket #{t['number']} ({t['type']}) Processing: {t['purpose']}" if t else "FREE"
                print(f"Counter {c_id}: {status_str}")
            
            print("\n--- COMPLETED HISTORY LOG ---")
            served_history = [t for t in tickets if t["status"] == "served" and t not in counters.values()]
            for t in served_history:
                print(f"Ticket #{t['number']} - {t['purpose']} ({t['type']})")
            if not served_history:
                print("No completed records found.")

        elif choice == "7":
            report(show_waiting=True, show_served=True, show_cancelled=True, show_counters=True)

        elif choice == "8":
            print("Shutting down Campus Queue Engine system. Goodbye!")
            break
        else:
            print("Error: Selection out of range bounds. Pick options 1-8.")

run_menu()