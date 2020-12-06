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
1. Clone the repo
2. Using Eclipse, open the 3 projects contained under eclipse-projects
3. Run a new Eclipse application, using tdt4250.project.model and tdt4250.project.design as plug-ins for the application
4. Open the tdt4250.project.design.examples folder in this new Eclipse application
5. This folder should contain a representation file, where the viewpoints are located

#### Dependencies
The project uses EMFJson-Jackson to read EMF formatted JSON as Resources, which later can be translated to an instance of type .xmi, which is easier to handle with representations. As such, a few dependencies must be downloaded.

1. Open Eclipse
2. Click Help > Install New Software
3. From the URI http://ghillairet.github.io/p2, install the bundles "Jackson" and "emfjson bundles"
4. All required dependencies should be installed after the prompted Eclipse restart

### User Guide
The project offers three different viewpoints. A complete cocktail party viewpoint, filled with all potential products, drinks and inventories. From this viewpoint you may double click inventories or drinks to view their respective viewpoints, inventory viewpoint and drink viewpoint. From the inventory viewpoint, you are able to see which drinks you can make with your current inventory, as well as alter your current stock. In the drinks viewpoint, you are able to read the instructions for creating the drink, and view which ingredients are neccessary to make it. From the main viewpoint, you are also able to add new products, drinks and inventories. 
