
while True:
    print("--[ GRADE CALCULATOR ]--")

    try:
        java = float(input("Enter Your Java Programming Score: "))
        c = float(input("Enter Your C Programming Score: "))
        database = float(input("Enter Your Database Programming Score: "))

        if java < 0 or java > 100 or c < 0 or c > 100 or database < 0 or database > 100:
            print("Error: Scores must be between 0 and 100.")
            continue

    except ValueError:
        print("Error: Please enter numbers only.")
        continue

    average = (java + c + database) / 3

    print("Your Average is:", round(average, 2))

    if average >= 90:
        print("-- Your Grade is: A --")
    elif average >= 80:
        print("-- Your Grade is: B --")
    elif average >= 75:
        print("-- Your Grade is: C --")
    else:
        print("-- Your Grade is: F --")

    while True:
        answer = input("Do you want to continue? (Y/N): ").strip().upper()

        if answer == "Y" or answer == "YES":
            break
        elif answer == "N" or answer == "NO":
            print("Program Ended.")
            exit()
        else:
            print("Invalid input: Please enter Y, YES, N, or NO.")