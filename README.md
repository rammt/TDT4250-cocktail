# Cocktail DSL Project
TDT4250 - Advanced Software Engineering

Team: William Andersson, Thomas Iversen Ramm, Eivind Rydningen, Anniken Syvertsen

### Description
The Cocktail DSL assists you in figuring out which drinks you can make with what you have at home.
Through the use of Sirius, it shows you the instructions and required ingredients for over 500 popular drinks. 

### Requirements
- Eclipse
- Eclipse Modelling Framework
- Sirius
- Emf-json jackson
- Acceleo

### The Ecore Model
The root of the model is the CocktailParty class, it may contain several user Inventories, Drinks (Cocktails) and Products.
A Drink is  specific Cocktail and may contain several DrinkIngredients. A DrinkIngredient is related to a product, however, a DrinkIngredient is specific for a given Drink and specifies the the amountType (f.ex liter, kilogram or piece) and the amount of the ingredient required for the Drink. The AmountType is an enum that holds all the various types of measurements found in the cocktail dataset.

TODO: Update image
![alt text](https://github.com/rammt/TDT4250-cocktail/blob/master/images/cocktail_model.png?raw=true "Cocktail Model in PlantUML")

### Chosen API


### Refactoring API to EMFJson
We chose to use Python for the refactoring of the original cocktail API. The result was a clean dataset on the EMFJson format.

### Transformation


### Visualization

### Custom Tools

## How To
Follow the installation steps to get the project running and follow the user guide to test the DSL features.

### Installation

#### Dependencies


### User Guide
