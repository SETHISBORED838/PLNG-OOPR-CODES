while True:

    print("\nARITHMETIC CALCULATOR")
    print("1. Addition")
    print("2. Subtraction")
    print("3. Multiplication")
    print("4. Division")
    print("5. Modulus")
    print("6. Increment")
    print("7. Decrement")

    choice = int(input("Select an arithmetic operation: "))

    if choice == 1:
        x = float(input("Enter the value of x: "))
        y = float(input("Enter the value of y: "))
        print("Variable Values: x =", x, "y =", y)
        print("Addition: x + y =", x + y)

    elif choice == 2:
        x = float(input("Enter the value of x: "))
        y = float(input("Enter the value of y: "))
        print("Variable Values: x =", x, "y =", y)
        print("Subtraction: x - y =", x - y)

    elif choice == 3:
        x = float(input("Enter the value of x: "))
        y = float(input("Enter the value of y: "))
        print("Variable Values: x =", x, "y =", y)
        print("Multiplication: x * y =", x * y)

    elif choice == 4:
        x = float(input("Enter the value of x: "))
        y = float(input("Enter the value of y: "))

        if y == 0:
            print("Error: Cannot divide by zero.")
        else:
            print("Variable Values: x =", x, "y =", y)
            print("Division: x / y =", x / y)

    elif choice == 5:
        x = float(input("Enter the value of x: "))
        y = float(input("Enter the value of y: "))

        if y == 0:
            print("Error: Cannot use zero for modulus.")
        else:
            print("Variable Values: x =", x, "y =", y)
            print("Modulus: x % y =", x % y)

    elif choice == 6:
        x = float(input("Enter the value of x: "))
        x = x + 1
        print("Variable Values: x =", x - 1)
        print("Increment: x + 1 =", x)

    elif choice == 7:
        x = float(input("Enter the value of x: "))
        x = x - 1
        print("Variable Values: x =", x + 1)
        print("Decrement: x - 1 =", x)

    else:
        print("Error: Invalid menu option.")

    answer = input("Do you want to continue? Type (YES/NO): ")

    if answer == "NO" or answer == "no":
        print("Calculator terminated.")
        break