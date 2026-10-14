while True:
    first_name = input("Enter first name: ").strip()
    if first_name == "":
        print("Names cannot be empty try again")
    elif not first_name.isalpha():
        print("thats not a letter try again")
    else:
        break 

while True:
    last_name = input("Enter Last name: ").strip()
    if last_name == "":
        print("Names cannot be empty try again")
    elif not last_name.isalpha():
        print("thats not a letter try again")
    else:
        break 


print("First name: " + first_name)
print("Last name: " + last_name)


full_name = first_name + " " + last_name
print("Full name: " + full_name)

print("First character: " + first_name[0])
print("Last character: " + last_name[-1])


print("Strings are immutable; individual characters and cannot be changed directly.")

try:
    full_name[0] = 'D'  
except TypeError:
  
    new_name = "D" + first_name[1:]
    print("New name: " + new_name)
    print("Original name: " + first_name)


print("Characters in the full name:")
for char in full_name: 
    print(char)

sliced_first = full_name[0:len(first_name)]
sliced_last = full_name[len(first_name) + 1:]
print("Sliced first name: " + sliced_first)
print("Sliced last name: " + sliced_last)


search_char = input("Enter one character to search: ")

if len(search_char) != 1:
    print("\n[Error]: You must enter exactly one character.")
elif not search_char.isalpha() and search_char != " ":                          
    print("\n[Error]: You can only search for alphabet letters or spaces.")
else:
    indices = []
    
    lower_full_name = full_name.lower()
    lower_search_char = search_char.lower()
    
    start_index = 0
    while True:
        
        pos = lower_full_name.find(lower_search_char, start_index)
        
     
        if pos == -1:
            break
            
        indices.append(str(pos))
        start_index = pos + 1  

    if len(indices) > 0:
        print("Character found at index: " + ", ".join(indices))
    else:
        print("Character '" + search_char + "' is not there.")
