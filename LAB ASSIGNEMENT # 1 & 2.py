print("ACTIVITY 1")

rate = 0.85

price1 = float(input("Enter price of product 1 in USD: "))
price2 = float(input("Enter price of product 2 in USD: "))
price3 = float(input("Enter price of product 3 in USD: "))
price4 = float(input("Enter price of product 4 in USD: "))
price5 = float(input("Enter price of product 5 in USD: "))
price6 = float(input("Enter price of product 6 in USD: "))

print("Product 1 in Euros:", price1 * rate)
print("Product 2 in Euros:", price2 * rate)
print("Product 3 in Euros:", price3 * rate)
print("Product 4 in Euros:", price4 * rate)
print("Product 5 in Euros:", price5 * rate)
print("Product 6 in Euros:", price6 * rate)



print("\nACTIVITY 2")

letters = ["A", "B", "C", "D", "E"]

for i in range(5):
    print(i + 1, letters[i])



print("\nACTIVITY 3")

number = int(input("Enter a multiple of 5 between 1 and 100: "))

if number % 5 == 0 and number >= 1 and number <= 100:
    print("The number is valid.")
else:
    print("The number is invalid.")



print("\nACTIVITY 4")

item1 = float(input("Enter the cost of item 1: "))
item2 = float(input("Enter the cost of item 2: "))

total = item1 + item2

payment = float(input("Enter your payment: "))

if payment < total:
    print("You still owe:", total - payment)
else:
    print("Thank you for your payment!")
    print("Your change is:", payment - total)
 
print("\nACTIVITY 5")

def last_word():
    word1 = input("Enter word 1: ")
    word2 = input("Enter word 2: ")
    word3 = input("Enter word 3: ")

    words = [word1, word2, word3]

    print("Last alphabetically:", max(words))

last_word()