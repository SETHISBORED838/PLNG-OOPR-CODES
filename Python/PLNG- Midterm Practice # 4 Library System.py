from datetime import date, datetime
import math

print("== WELCOME TO THE LIBRARY == (please be quiet)")

# Enter name
while True:
    Name = input("Enter your name: ")

    if Name.replace(" ", "").isalpha() and Name.strip() != "":
        break
    else:
        print("Nice try genius, names can only contain letters >;p")

print("Welcome", Name)

# Enter book name
while True:
    book = input("Enter your book's name: ")

    if book.strip() != "":
        break
    else:
        print("The book needs a name, smart guy.")

# Enter total pages
while True:
    try:
        TotalPages = int(input("Enter your book's total pages: "))

        if TotalPages > 0:
            break
        else:
            print("A book must have at least 1 page, smart guy.")

    except ValueError:
        print("That is not a valid page number. Numbers only!")

# Enter pages read
while True:
    try:
        PagesRead = int(input("Enter total pages read: "))

        if PagesRead < 0:
            print("You can't read negative pages!")
        elif PagesRead > TotalPages:
            print("Nice try, you can't read more pages than the book actually has!")
        else:
            break

    except ValueError:
        print("That is not a valid page number. Numbers only!")

# Calculate reading progress
PagesLeft = TotalPages - PagesRead
percentComplete = (PagesRead / TotalPages) * 100

# Enter issue date
while True:
    try:
        issuedInput = input("Enter the date issued (YYYY-MM-DD): ")
        dateIssued = datetime.strptime(
            issuedInput, "%Y-%m-%d"
        ).date()
        break

    except ValueError:
        print("Nice try, that's an invalid date. Try YYYY-MM-DD!")

# Enter due date
while True:
    try:
        DueInput = input("Enter the date due (YYYY-MM-DD): ")
        dateDue = datetime.strptime(
            DueInput, "%Y-%m-%d"
        ).date()

        if dateDue < dateIssued:
            print("The due date cannot be before the issue date!")
        else:
            break

    except ValueError:
        print("Nice try, that's an invalid date. Try YYYY-MM-DD!")

# Calculate dates
today = date.today()
daysLeft = (dateDue - today).days

# Calculate pages per day
if daysLeft > 0:
    pagesPerDay = math.ceil(PagesLeft / daysLeft)
else:
    pagesPerDay = 0

# Display library information
print("\n[-------- LIBRARY --------]")
print("Borrower:", Name)
print("Book:", book)
print("Current Date:", today)
print("Date Issued:", dateIssued)
print("Date Due:", dateDue)
print(f"Book complete percentage: {percentComplete:.1f}%")
print("Pages already read:", PagesRead)
print("Pages left to read:", PagesLeft)
print("[-------------------------]")

# Display due date status
if PagesLeft == 0:
    print("Congratulations! You have finished your book!")

elif daysLeft > 0:
    print("You still have", daysLeft, "days remaining.")
    print("You need to read", pagesPerDay, "pages per day to finish in time.")

elif daysLeft == 0:
    print("Your book is due today. Please bring it back or I will find you.")
    print("You still need to read", PagesLeft, "pages!")

else:
    daysOverdue = abs(daysLeft)
    print("Your book is overdue by", daysOverdue, "days... run.")
    print("You still need to read", PagesLeft, "pages!")