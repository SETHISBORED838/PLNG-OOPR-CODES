import math

while True:
    print("\nChoose the program you want to run")
    print("Program #1")
    print("Program #2")
    print("Program #3")
    print("Program #4")
    print("Program #5")
    print("Program #6")

    choice = input("Enter your choice (1-6): ").strip()

    if choice == "1":
        numbers = []

        for i in range(10):
            while True:
                try:
                    num = float(input("Enter real number " + str(i + 1) + " of 10: "))

                    if not math.isfinite(num):
                        print("Invalid input. Enter a finite number.")
                        continue

                    numbers.append(num)
                    break
                except ValueError:
                    print("Invalid input. Please enter a number.")

        total = 0
        count = 0

        for num in numbers:
            if num > 0:
                total += num
                count += 1

        print("Sum of positive numbers:", total)

        if count > 0:
            print("Average of positive numbers:", total / count)
        else:
            print("No positive numbers.")

        negative = 0
        for num in numbers:
            if num < 0:
                negative += 1

        print("Number of negative numbers:", negative)

        minimum = numbers[0]
        for num in numbers:
            if num < minimum:
                minimum = num

        print("Minimum value:", minimum)

    elif choice == "2":
        numbers = []

        for i in range(8):
            while True:
                try:
                    num = int(input("Enter integer number " + str(i + 1) + " of 8: "))
                    numbers.append(num)
                    break
                except ValueError:
                    print("Invalid input. Please enter a whole number.")

        unique = []

        for num in numbers:
            if num not in unique:
                unique.append(num)

        print("Array without duplicates:", unique)

        if len(unique) >= 2:
            unique.sort()
            print("Second largest:", unique[-2])
            print("Second smallest:", unique[1])
        else:
            print("Cannot find the second largest and smallest.")
            print("Please enter at least two different integers.")

    elif choice == "3":
        while True:
            data = input("Enter Data in Array (separated by spaces): ").split()

            if len(data) > 0:
                break

            print("Array cannot be empty. Try again.")

        print("Stored Data in Array:", *data)

        while True:
            try:
                position = int(input("Enter position of element to delete: "))

                if 1 <= position <= len(data):
                    del data[position - 1]
                    print("New data in Array:", *data)
                    break
                else:
                    print("Invalid position. Enter a position from 1 to", len(data))
            except ValueError:
                print("Invalid input. Enter a whole number.")

    elif choice == "4":
        while True:
            try:
                size = int(input("Enter Size of Array: "))

                if size > 0:
                    break

                print("Size must be greater than zero.")
            except ValueError:
                print("Invalid input. Enter a whole number.")

        numbers = []
        print("Enter any", size, "elements in Array:")

        for i in range(size):
            while True:
                try:
                    num = int(input("Element " + str(i + 1) + ": "))
                    numbers.append(num)
                    break
                except ValueError:
                    print("Invalid input. Enter a whole number.")

        even = []
        odd = []

        for num in numbers:
            if num % 2 == 0:
                even.append(num)
            else:
                odd.append(num)

        print("Even Elements:", *even)
        print("Odd Elements:", *odd)

    elif choice == "5":
        for i in range(4):
            print("*" + "*A" * i)


    elif choice == "6":
        while True:
            try:
                basic = float(input("Enter basic salary: $"))

                if not math.isfinite(basic):
                    print("Invalid input. Enter a finite number.")
                elif basic < 0:
                    print("Salary cannot be negative.")
                else:
                    break
            except ValueError:
                print("Invalid input. Please enter a number.")

        da = basic * 0.12
        hra = 150
        ta = 120
        others = 450
        pf = basic * 0.14
        tax = basic * 0.15

        net = basic + da + hra + ta + others - (pf + tax)

        print("\nBasic Salary: $", round(basic, 2))
        print("DA (12%): $", round(da, 2))
        print("HRA: $", hra)
        print("TA: $", ta)
        print("Others: $", others)
        print("PF (14%): $", round(pf, 2))
        print("IT (15%): $", round(tax, 2))
        print("Net Salary: $", round(net, 2))

    else:
        print("Invalid choice. Please select 1-6.")

    while True:
        again = input("\nDo you want to continue? Y/N: ").strip().upper()

        if again == "Y" or again == "YES":
            break
        elif again == "N" or again == "NO":
            print("Program ended.")
            exit()
        else:
            print("Invalid input. Please enter Y, YES, N, or NO.")