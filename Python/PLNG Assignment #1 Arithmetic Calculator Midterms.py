
while True:
    print("\n)-----------------( ARITHMETIC CALCULATOR )-----------------(")
    print("1. Addition          2. Subtraction       3. Multiplication")
    print("4. Division          5. Modulus           6. Increment")
    print("7. Decrement")

    try:
        choice = int(input("\nSelect an operation: "))

        if choice < 1 or choice > 7:
            print("Error: Invalid menu option")
            continue

        if choice >= 1 and choice <= 5:
            x = float(input("Enter the value of x: "))
            y = float(input("Enter the value of y: "))

            print("\nVariable Values: x =", x, ", y =", y)

            if choice == 1:
                print("Addition: x + y =", x + y)

            elif choice == 2:
                print("Subtraction: x - y =", x - y)

            elif choice == 3:
                print("Multiplication: x * y =", x * y)

            elif choice == 4:
                if y == 0:
                    print("Error: Cannot divide by zero!")
                else:
                    print("Division: x / y =", x / y)

            elif choice == 5:
                if y == 0:
                    print("Error: Cannot use modulus with zero")
                else:
                    print("Modulus: x % y =", x % y)

        elif choice == 6:
            x = float(input("Enter the value of x: "))

            print("\nVariable Values: x =", x)
            print("Increment: x + 1 =", x + 1)

        elif choice == 7:
            x = float(input("Enter the value of x: "))

            print("\nVariable Values: x =", x)
            print("Decrement: x - 1 =", x - 1)

    except ValueError:
        print("Error: Please enter a valid number")
        continue

    while True:
        answer = input("\nDo you want to continue? (YES/NO): ").strip().upper()

        if answer == "YES":
            break
        elif answer == "NO":
            print("Program terminated. Bye :)")
            exit()
        else:
            print("Error: Please enter YES or NO.")
