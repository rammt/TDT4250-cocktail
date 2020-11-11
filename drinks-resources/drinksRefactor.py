import json
import re
""" '/Users/tir/NTNU/TDT4250-cocktail/drinks-resources'
 """

f = open("drinks.json", "r") 

data = json.load(f)

j = 1

def convertFractionToDecimal(fraction):
  result = fraction
  if (fraction == "1/2"):
    result = ".5"
  elif(fraction == "1/4"):
    result = ".25"
  elif(fraction == "2/3"):
    result = ".66"
  elif(fraction == "1/3"):
    result = ".33"
  elif(fraction == "3/4"):
    result = ".75"
  elif(fraction == "1/8"):
    result = ".125"
  elif(fraction == "2/5"):
    result = ".4"
  elif(fraction == "1/6"):
    result = ".17"
  elif(fraction == "1/5"):
    result = ".2"
  elif(fraction == "4/5"):
    result = ".8"
  elif(fraction == "3/4-1"):
    result = ".75p"
  else:
    print("FRACTION ERROR: " + result)
  return result

def convertUnit(startPosition, measure_list):
  # No unit ex. 1/2 lime
  if (len(measure_list) == startPosition):
    return ""
  else:
    return measure_list[startPosition]

def convertMeasure(measure):
  measure = measure.strip()
  measure_list = measure.split(' ')
  amount = ""
  unit = ""

  # mellom x og y antall
  if (re.match("[0-9][-][0-9]", measure) is not None):
    amount = measure.split("-")[0]
    #TODO gjennsomsnitt av tallene
    if("-" in measure.split("-")[1]):
      unit = "strip"
    elif (len(measure_list) > 1):
      unit = measure_list[1]
    else:
      unit = ""

  # 1/2, 1/3 osv.
  elif (re.match("^[-+]?[0-9][/][0-9]", measure_list[0]) is not None):
    amount = "0" + convertFractionToDecimal(measure_list[0])
    unit = convertUnit(1, measure_list)
    if ("Fresh" in unit):
      unit = ""
  
  # 1 1/2, 1 1/3 osv.
  elif (len(measure_list) > 1 and re.match("^[-+]?[0-9]", measure_list[0]) is not None and re.match("^[-+]?[0-9][/][0-9]", measure_list[1]) is not None):
    # Filtrere ut alt som er et tall + en brøk
    amount = measure_list[0] + convertFractionToDecimal(measure_list[1])
    unit = convertUnit(2, measure_list)
    
  # Tar alt som er et tall + en bokstav og fjerner unødvendige beskrivelser
  elif (len(measure_list) > 1 and re.match("^[-+]?[0-9]", measure_list[0]) is not None and re.match("^[a-z]", measure_list[1]) is not None):
    amount = measure_list[0]
    unit = measure_list[1]
    
    if (unit == "fifth"):
      amount = "0" + convertFractionToDecimal(amount + "/5")
      unit = ""
    
    #TODO: Håndterer ikke f.eks. "1 small bottle". Det returnerer "1 small" per nå

  # Alt som bare er et tall og er lenger enn 1
  elif (len(measure_list) == 1 and re.match("^[-+]?[0-9]$", measure_list[0]) is not None):
    amount = measure_list[0]
    unit = ""

  # Alt som starter og slutter med et tall
  elif (re.match("^[-+]?[0-9]$", measure_list[0]) is not None):
    amount = measure_list[0]
    if ("-" in measure):
      unit = "strips"
    elif (len(measure_list) == 2):
      unit = measure_list[1]
    else:
      unit = measure_list[2]

  # Alt som starter med et tall
  elif (re.match("^[-+]?[0-9]", measure_list[0]) is not None):
    if("-" in measure):
      i = measure.index("-")
      #TODO Ta gjennomsnittet av 2-4 i stedet for å hente ut 2
      amount = str(int(measure[0:i]) + 1)
      unit = ""
    elif("cl" in measure):
      amount = measure[0]
      unit = measure[1:3]
    elif("ml" in measure):
      amount = measure[0:2]
      unit = measure[2:4]
    else:
      amount = measure
      unit = ""
  
  # Juice of 1/2, Add 1/2 x...
  elif ("/" in measure):
    index = measure.index("/")
    amount = "0" + convertFractionToDecimal(measure[index-1] + measure[index] + measure[index+1])
    unit = ""


  # Juice of 1
  elif("Juice of" in measure):
    amount = "1"
    unit = ""

  elif("Add" in measure and len(measure_list) == 3 or "About" in measure):
    amount = measure_list[1]
    unit = measure_list[2]


  elif("bottle" in measure):
    amount = "1"
    unit: "bottle"

  elif("glass" in measure):
    amount = 1
    unit = "glass"

  elif("pinch" in measure or "Pinch" in measure):
    amount = "1"
    unit = "pinch"


  # No measure for "fill with", "top up with", "chilled"
  elif ("with" in measure or "Coarse" in measure or "Strong" in measure or "Over" in measure or "(" in measure or "Fresh" in measure or "Add" in measure or "fill" in measure or "Garnish" in measure or "Chilled" in measure or "of" in measure or "top" in measure or "taste" in measure or "Ground" in measure or "mini" in measure or "Bacardi" in measure or "Unsweetened" in measure or "black" in measure or "Squeeze" in measure or "frozen" in measure or "pods" in measure or "or" in measure or "very" in measure or "lots" in measure or "Grated" in measure):
    amount = ""
    unit = ""

  elif(len(measure)== 0):
    amount = ""
    unit = ""

  else:
    amount = ""
    unit = measure_list[0]

  # set unit to lowercase
  unit = unit.lower()

  # fix multiple names
  if(unit == "tsp" or unit == "tblsp" or unit == "tbsp"):
    unit = "tablespoon"

  
  # remove plurals
  if(unit != "" and unit[len(unit)-1] == "s"):
    oldunit = unit
    if(unit == "dashes"):
      unit = "dash"
    elif(unit == "cubes"):
      unit = "cubes"
    elif(unit == "glass"):
      unit = "glass"
    elif(unit == "pinches"):
      unit = "pinch"
    else:
      unit = unit[0:len(unit)-1]
  
  # Fjerne flertallsendinger på unit
  #if (re.match("\s$", unit) is not None):
  #  print(unit)
  

  return [amount, unit]

enums = []
drinks = []

for drink in data["drinks"]:
  _id = drink["idDrink"]
  name = drink["strDrink"]
  category = drink["strCategory"]
  instructions = drink["strInstructions"]
  listIngredients = []
  listAmount = []
  listUnit = []
  ingredients = []
  amount = ""
  unit = ""

  for element in drink:
    # element unit and amount
    if(element[3:10] == "Measure" and drink[element] != None):
      converted = convertMeasure(drink[element])
      amount = converted[0]
      unit = converted[1]
      listAmount.append(amount)
      listUnit.append(unit)

      #print(converted)
    elif (element[3:10] == "Measure" and drink[element] == None):
      listAmount.append(None)
      listUnit.append(None)

    # element is ingredient
    if(element[3:13] == "Ingredient"):
      ingredient = drink[element]
      listIngredients.append(ingredient)

    # add list of all unique units
    if(unit not in enums):
      enums.append(unit)

  #print(listIngredients, listAmount, listUnit)
  # generate dictionary for each ingredient
  for l in range(len(listIngredients)):
      ingredientstemp = {}
      ingredient = listIngredients[l]
      ingredient_amount = listAmount[l]
      ingredient_unit = listAmount[l]
      # gidder ikke legge det inn hvis alle er tomme
      if (ingredient is not None and ingredient_amount is not None and ingredient_amount is not None):
      #her, i dictionary, må vi legge til listen med ingredienser
        ingredientstemp["ingredient"] =  ingredient
        ingredientstemp["amount"] = ingredient_amount
        ingredientstemp["unit"] = ingredient_unit
        ingredients.append(ingredientstemp)


  print("ingredientstemp ", _id, name, category, instructions, ingredientstemp)
print(enums)

f.close()