import json
import re
""" '/Users/tir/NTNU/TDT4250-cocktail/drinks-resources'
 """

f = open("clean_drinks.json", "r") 

data = json.load(f)

drinks = []

for drink in data["drinks"]:
  drink = {
    "eClass" : "platform:/plugin/tdt4250.project.model/model/cocktail.ecore#//Drink",
    "id" : drink["id"],
    "name" : drink["name"],
    "category" : drink["category"],
    "instructions" : drink["instructions"],
    "ingredients" : drink["ingredients"]
  }

  drinks.append(drink)

# Convert drinks to JSON
result = {
  "drinks" : drinks
}
json_string = json.dumps(result)

f2 = open("drinks_emf.json", "w")
f2.write(json_string)
f2.close()

f.close()