message = "Hello Python" # the message
#the comments are for me to review


bytes_obj = message.encode('utf-8') # i encode the text into bytes
print(f"1. Bytes object: {bytes_obj}")

bytes_to_str = bytes_obj.decode('utf-8') # turn it back to text
print(f"2. Bytes to string: {bytes_to_str}")

bytes_to_hex = bytes_obj.hex() #turn to hexe decimals
print(f"3. Bytes to hex: {bytes_to_hex}")

hex_to_bytes = bytes.fromhex(bytes_to_hex) #hexe into byte text
print(f"4. Hex to bytes: {hex_to_bytes}")

new_bytearray = bytearray(message, 'utf-8') #makes it into a byte array
print(f"5. New bytearray: {new_bytearray}")

bytes_to_bytearray = bytearray(bytes_obj) # takes an exisitng byte into a byte array
print(f"6. Bytes to bytearray: {bytes_to_bytearray}")

sliced_bytes = bytes_obj[6:] #cut the byte from 6 and towards the right and keep it while 5 and the rest are removed (in our case 6 = P)
print(f"7. Sliced bytes: {sliced_bytes}") #show the sliced message in byte

bytes_to_bytearray[0] = ord('h') #ord is a translator for robot we just asked to chagne "H" into "h"
modified_message = bytes_to_bytearray.decode('utf-8') #back to string
print(f"8. Modified message: {modified_message}")
