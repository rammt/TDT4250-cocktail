# Prepare dataset for EMF

import json
import re
""" '/Users/tir/NTNU/TDT4250-cocktail/drinks-resources'
 """

f = open("clean_drinks.json", "r") 

data = json.load(f)

products = []
for ingredient in data["ingredients"]:
  product = {
    "eClass": "platform:/resource/tdt4250.project.model/model/cocktail.ecore#//Product",
    "name": ingredient,
    "vol": "0"
  }
  products.append(product)

drinks = []
for drink in data["drinks"]:

  requiredIngredients = []

  # Hver ingreduens i en drink
  for ingredient in drink["ingredients"]:
    # Finne id i product-liste
    productName = ingredient["ingredient"]
    productIndex = None
    ref = ""
    amount = None
    amountType = ingredient["unit"]
    
    # Handle empty units
    if (ingredient["amount"] == "" or ingredient["amount"] is None):
      amount = 0.0
    elif (ingredient["amount"] == "0.75p"):
      amount = 0.75
    elif (ingredient["amount"] == "10-12"):
      amount = 11.0
    else:
      amount = float(ingredient["amount"])

    # Handle empty amount types
    if (ingredient["unit"] == "" or ingredient["unit"] is None):
      amountType = "unknown"

    if amountType is not None and "-" in amountType:
      amountType = amountType.replace("-", "_")

    # For hvert produkt må det sjekkes hvilken ID produktet har
    for i in range(len(products)):
      if (products[i]["name"] == productName):
        productIndex = i
        ref = "//@cocktailProducts." + str(productIndex)

    requiredIngredient = {
      "eClass": "platform:/resource/tdt4250.project.model/model/cocktail.ecore#//DrinkIngredient",
      "product": {
        "eClass": "platform:/resource/tdt4250.project.model/model/cocktail.ecore#//Product",
        "$ref": ref
      },
      "amount": amount,
      "amountType": amountType
    }
    requiredIngredients.append(requiredIngredient)
  drink = {
    "eClass" : "platform:/resource/tdt4250.project.model/model/cocktail.ecore#//Drink",
    "id" : drink["id"],
    "name" : drink["name"],
    "instructions" : drink["instructions"],
    "requiredIngredients" : requiredIngredients
  }

  drinks.append(drink)

# Convert drinks to JSON
result = {
  "eClass": "platform:/resource/tdt4250.project.model/model/cocktail.ecore#//CocktailParty",
  "cocktailProducts": products,
  "drinkRegister" : drinks
}
json_string = json.dumps(result)

f2 = open("drinks_emf.json", "w")
f2.write(json_string)
f2.close()

f.close()