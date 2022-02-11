  # 1. For a given person, return their name
#  
#   

# tests start below:
def get_name(person):
    return person["name"]

def get_favourite_tv_show(fav_show):
    return fav_show["favourites"]["tv_show"]

def likes_to_eat(food, person):
    for any_items in food["favourites"]["snacks"]:
        if any_items == person:
            return True
    else:
        return False
# #test 4 For a given person, add a new name to their list of friends
def add_friend(person, friend):
    return person["friends"].append(friend)


# 5. For a given person, remove a specific name from their list of friends

def remove_friend(person, friend):
    return person["friends"].remove(friend)

# test 6 write a function that returns a total of everyone's money
def total_money(people):
    total_money = 0
    for person in people:
        total_money += person["monies"]
    return total_money

# test 7 For two given people, allow the first person to loan a given value of money to the other
  # (hint: our function will probably need 3 arguments passed to it... the ler, the lee, and the amount for this function)
  # (hint2: You should test if both the ler's and the lee's money have changed, maybe two assertions?
def l_money(person1, person2, amount):
    person_1_money = 0
    person_2_money = 0
    if (person_1_money < person_1_money) & (person_2_money > person_2_money):
        money_lent = person_1_money - person_2_money
        return money_lent




#  self.person5 = {
#       "name": "Daphne",
#       "age": 20,
#       "monies": 100,
#       "friends": [],
#       "favourites": {
#         "tv_show": "X-Files",
#         "snacks": ["spinach"]

#self.people = [self.person1, self.person2, self.person3, self.person4, self.person5]