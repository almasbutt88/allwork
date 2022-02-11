# Practice translating a flowchart into code
# Practice pseudocode
# Practice conditional logic
# Write a Python program based on the following flowchart.
#turn on computer

print("Turn on your computer")

user_input1= input("Did it boot up?:")

if user_input1== "yes":
    print("Login with password")
elif user_input1 == "no":
    user_input2 = input("is it plugged in?:")
    if user_input2 == "no":
        print("please plug it in")
    user_input = input("Did this fix the problem?:")
    if user_input == "yes":
        print("Login with password")
    if user_input == "no":
        print("Your computer is absolutely snookered")
    else:
        print("get a new computer")
print("finished")



# start
# turn on computer
# did it boot up >> yes >> log in with password
# no>> is it plugged in >> yes

# is it plugged in
