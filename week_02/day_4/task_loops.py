#part 1
ages = [5, 15, 64, 27, 84, 26]


# Return a list of only the odd ages.

for num in ages:
    if num % 2 != 0:
        print(num)

# or you could do the following if doing single list comprehension

odd_ages = [num for num in ages if num & 2 != 0]
print (odd_ages)
    

#part 2
chicken_names = ['Hen Solo', 'Cluck Norris', 'Hennifer Lopez', 'ChewPekka', 'Feather Locklear']
# Return a list with chickens whose name is more than 10 characters
super_chicken = [name for name in chicken_names if len(name) > 10]
print(super_chicken)

# Return a list of chickens whose name starts with the letter H

#part 3

words = ['The', 'quick', 'brown', 'fox', 'jumped', 'over', 'the', 'lazy', 'dog']

start_h = [name for name in chicken_names if name[0 =="H"]]
print(start_h) 

words = ["The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"]
# Build a new list, with the first letter from each word
# Convert each letter to lower case
# Expected output: ["t", "q", "b", "f", "j", "o", "t", "l", "d"]

# Hint: Strings in Python work as if they were a tuple full of characters. How would you

letters = [word[0].lower() for word in words]
print(letters)