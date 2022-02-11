numbers = [1, 20, 3, 40, 5]
#any() takes an iterable that be looped over. 

# print(any(variable ==20 for variable in list))
# print(any(num == 20 for num in numbers))
# print(any(num == 60 for num in numbers))

# min(iterable)

# print(min(numbers))

# will print the smallest number in the list

# print(max(numbers))

# print(sum(numbers))
# print(sum(numbers, 100))
# sum() takes iterable and can also take start point in the list , which is 10 but you can alo start from 40

# map(function, iterable, ...)


# def square(number):
#     return number * number
# # below function will return the map location of 
# print(map(square, numbers))

# print(list(map(square, numbers)))

# filter(function, iterable) this takes a function and an iterable
# numbers = [10, 20, 30, 40, 50]
# def is_even(num):
#     return num % 2 ==0
# print(filter(is_even, numbers))
# print(list(filter(is_even, numbers)))

# sorted(iterable, key = None(by default), reverse = False by default and sorts it in ascending order, change it to True for descending order High to low
# # 
# sorted_numbers = sorted(numbers)
# print(f"sorted list after using sorted: {sorted_numbers}")

# print(f"original list: {numbers}")
# # sorted doesnt mutate the original list. Sort does.

# sorted_numbers_desc = sorted(numbers, reverse=True)
# print(f"sorted list in desc order after using sorted: {sorted_numbers_desc}")   


# # slice(start (optional int value, by default it is None), stop (needs this value) step (this is the steps between indexes, like 2 would skip 1 and print every 2nd word))
# room_name = 'Ada Lovelace'

# room_name[slice(4)]
# # will print Ada
# print(room_name[:4])

# slice_room_name = slice(4, 8)
# print(room_name[slice_room_name])
# print(room_name[4:8])
# # start and stop above

# slice_room_name_step = slice(0, 1200, 2)
# print(room_name[slice_room_name_step])
# print(room_name[0:12:2])

# you can also do print(room_name[::2]) where first position is 0 by default and 2nd position or argument is last value by default

# sets:
# set(iterable)
numbers = [30, 2, 1, 4, 1, 2, 3, 1, 2, 4, 4, 5, 6, 5, 6]
print(f"list before conversion is: {numbers}")
print(f"list after conversion is : {set(numbers)}") #returns a sorted list and removes all duplicates