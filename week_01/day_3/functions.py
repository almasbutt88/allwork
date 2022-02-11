# #Define a function
# def sum(a, b):
#     # total = a +b
#     # return total    or you can do it as follows
#     return a+b

# result = sum(3, 5) 
# result_2 = sum(4, 9)
# # 3 is going to map to a and 5 will map to b but it wont print anything just yet
# print(result)
# print(result_2)

def func_return_multi(a, b):
    return a+b, a*b, a/b
#Tuple
result = func_return_multi(5, 9)
print(result[2])