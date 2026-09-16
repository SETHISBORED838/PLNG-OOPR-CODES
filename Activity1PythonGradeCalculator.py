def cal():

    java = 0
    Cpro = 0
    database = 0
    choice = 0

    print("== Grade Calculator ==")
    print("")

    print("Enter your Grade in Java:")
    java = float(input())

    print("Enter your Grade in C:")
    Cpro = float(input())

    print("Enter your Grade in Database:")
    database = float(input())
    print("")

    average = (java + Cpro + database) / 3

    if average > 90:
        print("Your Grade is: A! >v<")
    elif average > 80:
        print("Your Grade is: B :)")
    elif average > 70:
        print("Your Grade is: C :I")
    else:
        print("Your Grade is: F :(")

    print(f"you average is: {average:.2f}")
    print("")

    print("Do you want to continue : [1]YES / [2]NO")
    choice = input()

    if choice == "1":
        print("")
        cal() 
    else:
        print("bye!")

cal()
