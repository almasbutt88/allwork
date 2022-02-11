# meals = {"breakfast": "yoghurt",
#         "sushi": "steak",
#         "dinner": "steak"
#         }
# #breakfast is key and yogurt is value. Key and value.
# print("dinner" in meals)

# meals["supper"] = "melon"
# print(meals)

# del(meals["supper"])
# print(meals.values)
# next example

countries = {
    "uk" : {
        "captal": "London",
        "population": 60000000
    },
    "spain": {
        "capital": "Madrid",
        "population":45000000
        }
}
print(countries["uk"]["population"])

print(countries["uk"].keys())