# counter  = 0
# my_number = 5

# while (counter < my_number):
# #     print(f"counter is {counter}")


# my_number = 5

# value = int(input("What number am I thinking of?"))

# while (value != my_number):
#     if (value > my_number):
#         print('too high')
#     else:
#         print("too low")
#     value = int(input("try again...")
#     print("You got it")  << cant get this to work


# while(True):
#     line = input("type something")
#     if(line.lower() == "q"):
#         break
#     print(f'you typed: {line}')


# numbers below: we want to 
numbers = [1,2,3,4,5]

# for number in numbers:
#     print(number * 2)
# total = 0
# for number in numbers:
#     total = total + number

# print(total)


chickens = [
    
    
    
    {'name' : 'Margaret', 'age' : 2, 'eggs':0},
    
    {'name':'Hetty', 'age':1, 'eggs':4},
    {'name':'Henrietta', 'age':4, 'eggs':6}, 
    {'name':'Audrey','age':1, 'eggs':4}, 
]

total = 0

for chicken in chickens:
    total += chicken["eggs"]
    chicken["eggs"] = 0
print(f'{total} eggs collected')

# for chicken in chickens:
#     print(f"{chicken['name']} is {chicken['age']}")