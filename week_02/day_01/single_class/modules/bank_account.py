
class BankAccount:
   def __init__(self, holder_name, balance, account_type):

      self.holder_name = holder_name
      self.balance = balance
      self.account_type = account_type
      self.rates = {
      "personal": 10,
      "business": 50
      }

      

# def get_account_name(account):
#     return account["holder_name"]
   def pay_in(self, amount):
      self.balance += amount

#Make a pay_monthly_fee method, which reduces the value of the account by 50. if account is personal, fee is 10. Try calling it in app.py

   def pay_monthly_fee(self):
      self.balance -= 50

   def pay_monthly_fee(self):
      if self.account_type == "business":
         x = self.account_type

         self.balance -= self.rates[x]

      #    self.balance -= 50
      # else:
      #    self.balance -= 10
