#hi this is all i can recover from our last meeting since i was not able to save the file sorry :(

txt = "Hello Word!"
print(txt[2:5])
print(txt.upper())

print("\n")

name = "Python"
print(f"I love {name}")

print(10 > 9)
print(10 == 9)
print(10 < 9)

print("\n")

print(10 < 9)
print(10 == 9)
print(bool("Hello"))
print(bool(0))

a = 15
b = 4

print(a % b)
print(a // b)
print(a ** b)

a += 10

print("\n")

thislist =["apple","banana","cherry"]
print(thislist)

thislist.append("orange")
print(thislist)

thislist.pop(1)
print(thislist)

del thislist[0]
print(thislist)

newlist = ["apple","banana","cherry"]
for  i in range(len(newlist)):
    print(newlist[i])
    
    colors = ["red","green","blue"]
    
    print(colors[0])
    
    colors[1] = "yellow"
    
    colors.append("purple")
    
    del colors[0]
    
print("\n")

thistuple = ("apple","banana","cherry")
print(thistuple[-1])

newtuple = ("apple","banana","cherry","orange","kiwi","melon","mango")
print(newtuple[2:5])

a = 33
b = 33
if b > a:
    print("b is greater than a")
elif a == b:
    print("a and b are equal")
else: print("a is greater than b")

print("\n")

a = 200
b = 33
if b > a:
    print("b is greater than a")
elif a == b:
    print("a and b are equal")
else:
    print("a is greater than b")
    
    age = 20
    if age <= 13:
        print("child")
    elif age < 18:
        print("teenager")
    else:
        print("adult")