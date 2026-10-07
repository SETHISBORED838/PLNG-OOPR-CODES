#program1
print("Hello World")

#program2
usertext = input("Whats your name? ")
print ("Hello", usertext)

#program3
num1 = input('Enter first number: ')
num2 = input('Enter first number: ')

sum = float(num1) + float(num2)

print ('the sum of {0} and {1} is {2}'.format(num1, num2, sum))

#program4
num1 = input('Enter first number: ')
num2 = input('Enter first number: ')

average = int((num1) + int(num2))

print('average:{0}'.format(average))

#program5
visagrade = input('enter your visa grade : ')
finalgrade = input('enter your final grade : ')
average =(float(visagrade)*0.3)+(float(finalgrade)*0.7)
print("average :{0} ".format(average))

#program6
firstexam = input('your first exam : ')
secondexam = input('your second exam : ')
thirdexam = input('your third exam : ')
average =(float(firstexam)+float(secondexam)+float(thirdexam))/3
print("average :{0} ".format(average))

#program7
average = input('enter average : ')
if(int(average)>=50):
 print("Passed")
else:
 print("Failed")

#program8
num = int(input("Enter a number: "))
if (num % 2) == 0:
    print("{0} is Even".format(num))
else:
    print("{0} is Odd".format(num))

#program9
num = float(input("Enter a number: "))
if num > 0:
   print("Positive number")
elif num == 0:
   print("Zero")
else:
   print("Negative number")

#program10
print("body mass index calculation program")
height = float(input("enter height (m):"))
weight = int(input("enter weight (kg):"))

index = weight/(height*height)

if index <=18:
   print("\n underweight BMİ:{}".format(index))
elif index > 18 and index <=25 :
   print("\n overweight BMİ:{}".format(index))
elif index > 25 and index <=30:
   print("\n obese BMİ:{}".format(index))
elif index > 30:
   print("\n severely obese BMİ:{}".format(index))

#program11
age = input('enter age : ')
if(int(age)<18):
   print("Your Age Is Not Eligible To Get A Driver's License")
else:
   print("Your Age Is Eligible To Get Your License")

#program12
for i in range(1,101):
   print(i)

#programn13
for i in range(1,101):
   if i%2==0:
      print(i)

#programn14
for i in range(1,101):
   if i%2!=0:
      print(i)

#programn15
for i in range(1,101):
   if i%3==0 or i%5==0:
      print(i)

#programn16
num = input('enter number: ')
for i in range(1,int(num)+1):
 print(i)

#programn17
short = input('Enter short side : ')
tall = input('Enter tall side: ')
area = int(short)*int(tall)
perimeter =2*(int(short)+int(tall))
print("area: {0}".format(area))
print("perimeter: {0}".format(perimeter))

#program18
word = 'mrhuseyin'
for char in word:
   print(char)

#program19
sumofnumbers=0;
num1 = input('first number: ')
num2 = input('second number: ')
for i in range(int(num1)+1,int(num2)):
   sumofnumbers+=i
   print("Sum of numbers between {0} and {1} : {2}".format(num1,num2,sumofnumbers))

#program20
selection = input("Press (1) for Cinema, (2) for Theater : ")
student = input("Are you student(Y/N) : ")
price = 0
#non-discounted fee calculation
if selection == '1':
   price = 10 #cinema
elif selection == '2':
   price = 5 #theatre
   #student discount
if student =='Y' or student =='y':
   price=price / 2 #%50

#program21
num = int(input("Enter a number: "))

if num > 1:
   for i in range(2,num):
      if (num % i) == 0:
         print(num,"is not a prime number")
         print(i,"times",num//i,"is",num)
         break
      else:
         print(num,"is a prime number")

else:
   print(num,"is not a prime number")

#program22
NumList = []
Even_Sum = 0
Odd_Sum = 0

Number = int(input("Please enter the Total Number of List Elements: "))
for i in range(1, Number + 1):
 value = int(input("Please enter the Value of %d Element : " %i))
 NumList.append(value)

for j in range(Number):
 if(NumList[j] % 2 == 0):
  Even_Sum = Even_Sum + NumList[j]
else:
 Odd_Sum = Odd_Sum + NumList[j]

 print("\nThe Sum of Even Numbers in this List = ", Even_Sum)
 print("The Sum of Odd Numbers in this List = ", Odd_Sum)

#program23
newsalary = 0
salary = input("enter new salary: ")
raise_rate = input("salary raise rate(%): ")
newsalary = float(salary) + (float(salary) * float(raise_rate) / 100)
print(f"increased salary: {newsalary:.2f}")


#program24
import math
def find_Diameter(radius):
   return 2 * radius

def find_Circumference(radius):
   return 2 * math.pi * radius

def find_Area(radius):
   return math.pi * radius * radius

r = float(input(' Please Enter the radius of a circle: '))

diameter = find_Diameter(r)
circumference = find_Circumference(r)
area = find_Area(r)

print("\n Diameter Of a Circle = %.2f" %diameter)
print(" Circumference Of a Circle = %.2f" %circumference)
print(" Area Of a Circle = %.2f" %area)

#programn25
def areaRectangle(a, b):
   return (a * b)
def perimeterRectangle(a, b):
   return (2 * (a + b))
a = 5;
b = 6; print ("Area = ", areaRectangle(a, b))

print ("Perimeter = ", perimeterRectangle(a, b))
