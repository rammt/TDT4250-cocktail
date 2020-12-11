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
The root of the model is the CocktailParty class, it may contain several Inventories, Drinks (Cocktails) and Products.
A Drink is specific mixture of ingredients, like cocktails or special shots. We modeled a drink to contain DrinkIngredients. A DrinkIngredient contains an AmountType (like CL, OZ, Cup), an amount and a Product. An AmountType is an enumerator that has values for all the different types of amounts our data set provided. An Amount is a special float which may not be negative, using our own defined Data Type. A Product is some ingredient that may be used in drinks, like Lime, Vodka and Coca Cola, which has an optional feature for Vol, in case the product contains alcohol. We wanted to separate Products and DrinkIngredients, as different drinks require different amounts of the same products. Drinks also have two derived features, Complexity and Strength. These are calculated from the amount of ingredients required, and the ratio of total volume to alcohol volume in the drink. An Inventory contains DrinkIngredients, so you can compare an inventories stock to what drinks require. 

![alt text](https://github.com/rammt/TDT4250-cocktail/blob/master/images/cocktail_model.png?raw=true "Cocktail Model in PlantUML")

### Chosen API
Our data source is [thecocktaildb.com API](https://www.thecocktaildb.com/api.php). It contains 600+ drinks with ingredients.

### Refactoring API to EMFJson
Considering our refactoring was a one time job, we wanted to make it as easy for ourselves as possible. We used Python to iterate through our data set, and rewrote the data set in EMFJson format. Following this, we loaded the .json file as a resource, and translated it to an .xmi resource. How this was done is shown in tdt4250.project.resources/src/LoudResourceToXMI.java.

## How To
Follow the installation steps to get the project running and follow the user guide to test the DSL features.

### Dependencies
The project uses EMFJson-Jackson to read EMF formatted JSON as Resources, which later can be translated to an instance of type .xmi, which is easier to handle with representations. As such, a few dependencies must be downloaded.

1. Open Eclipse
2. Click Help > Install New Software
3. From the URI http://ghillairet.github.io/p2, install the bundles "Jackson" and "emfjson bundles"
4. All required dependencies should be installed after the prompted Eclipse restart

### Installation
1. Clone the repo
2. Using Eclipse, open the 4 projects contained under eclipse-projects
3. Run a new Eclipse application, using tdt4250.project.model and tdt4250.project.design as plug-ins for the application
4. Import the tdt4250.project.design.examples folder in this new Eclipse application
5. OPTIONAL: If you want to edit the views or view how the design file is used, you may import tdt4250.project.design as well.

### User Guide
Before opening any views, the Cocktail Viewpoint must be enabled. Open the representations.aird file and choose to enable it. A view should automatically be created. NOTE: Mac users have experienced the instance being too demanding, should this be the case, simply switch out the CocktailParty.xmi instance with SimpleCP.xmi in tdt4250.project.design/resources/.

The project offers four different views. A complete cocktail party view, filled with all potential products, drinks and inventories. From this view you may double click inventories, drinks and products to see their respective views, inventory view, drink view and product view. This complete cocktail party view gives an overview of all the data in the instance.

From the inventory view, you are able to see which drinks you can make with your current inventory, as well as alter your current stock.

![alt text](https://github.com/rammt/TDT4250-cocktail/blob/master/images/inventory.png?raw=true "Inventory View")

In the drinks view, you are able to read the instructions for creating the drink, and view which ingredients are neccessary to make it.

![alt text](https://github.com/rammt/TDT4250-cocktail/blob/master/images/drink.png?raw=true "Drink View")

From the product view, you may see which drinks use the product.

![alt text](https://github.com/rammt/TDT4250-cocktail/blob/master/images/product.png?raw=true "Product View")


Additionally, all views where drinks are present, you may double click the drinks name to look at the view for that drink. 

#### Custom Tools
The diagrams offer different custom tools for adjusting their respective contents. In the main view, you can choose to add new containers to a CocktailParty, these containers are new inventories or new drinks. From the inventory view, you are able to alter your current stock, in case you have bought new ingredients, or used up some previous ingredients. In the drinks viewpoint, you can edit a drinks required ingredients, if you feel the drink could improve its contents somehow. When creating new containers or editing ingredients, only default values are given when using a creation tool. As such, the properties view should stay open so you can edit the contents as you see fit.
