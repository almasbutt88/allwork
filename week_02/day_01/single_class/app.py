from modules.bank_account import *

# account = {
#     "holder_name": "Michael",
#     "balance": 500,
#     "type": "business"
#     }

# # print(get_account_name(account))

# bank_account = BankAccount("Michael", 500, "business")
# print(bank_account.holder_name)

# bank_account.holder_name = "Aga"
# print(bank_account.holder_name)

# bank_account.pay_in(50)
# print(bank_account.balance)

# bank_account.pay_monthly_fee()
# print(bank_account.balance)

bank_account = BankAccount("Almas", 500, "personal")
bank_account.pay_monthly_fee()
print(bank_account.balance)

print(BankAccount[self.rate])