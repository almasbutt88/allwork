# test 1

def get_pet_shop_name(pet_shop):
    return pet_shop["name"]


#test 2

def get_total_cash(cash):
    return cash["admin"]["total_cash"]

#test 3
def add_or_remove_cash(shop, sum):
    
    if sum > 0:
        new_total = shop["admin"]["total_cash"] + sum
        shop["admin"]["total_cash"] = new_total
        return shop["admin"]["total_cash"]
    else:
        if sum < 0:
            minus_total = shop["admin"]["total_cash"] - sum
            shop["admin"]["total_cash"] = minus_total
            return shop["admin"]["total_cash"]

# test 4
def get_pets_sold(shop):
    return shop["admin"]["pets_sold"]

# #test 5
# def get_pets_sold(shop, pets_sold):
#     shop["admin"]["pets_sold"].append(pets_sold)
#     return shop["admin"]["pets_sold"]

# test 6
def get_stock_count(shop):
    return len(shop["pets"])

# test 7
def get_pets_by_breed(shop, breed_name):
    breed_name = shop["pets"]["breed"]
    return breed_name
