# # #user input
# # user_input = input("When was Python created?:")

# # if int(user_input) == 1970:
# #     print("Probably right, I am not sure either")
# # else:
# #     print("No danger mate, what you on about?")

# hungry = True
# tired = True
# if hungry and tired:
#     print("Hangry!!")

# tired = False
# if hungry or tired:
#     print("Grumpy!")

#Ternary Operator
# score = 6

# if score >5:
#     print("pass")
# else:
#     print("fail")

# another way to write the above is:

score = 6

# if score> 5:
#     result = "pass"
# else:
#     result = "fail"
# print(result)

result = "pass" if score > 5 else "fail"
print(result)
#or print("pass" if score > 5 else "fail")