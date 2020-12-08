package tdt4250.project.design;

import java.util.ArrayList;
import java.util.List;
import tdt4250.project.model.cocktail.*;

/**
 * The services class used by VSM.
 */
public class Services {
    	
    public List<Drink> getCreatableDrinksForInventory(Inventory inv) {
		List<Drink> creatableDrinks = new ArrayList<>();
		List<Drink> drinkList = inv.getParty().getDrinkRegister();
		List<DrinkIngredient> inventoryIngredients = inv.getAvailableIngredients();
		
		for (Drink drink: drinkList) {
			if (drink.getRequiredIngredients().stream().allMatch(drinkDI -> {
				return inventoryIngredients.stream().anyMatch(invDI -> {
					return isAvailableIngredient(invDI, drinkDI);
				});
			})) {
				creatableDrinks.add(drink);
			};
		}
		
		return creatableDrinks;
	}
    
   
    public List<Drink> getAlmostCreatableDrinksForInventory(Inventory inv) {
		List<Drink> creatableDrinks = new ArrayList<>();
		List<Drink> drinkList = inv.getParty().getDrinkRegister();
		List<DrinkIngredient> inventoryIngredients = inv.getAvailableIngredients();
		
		for (Drink drink: drinkList) {
			int amtIngredients = drink.getRequiredIngredients().size();
			int amtAvailableIngredients = (int) drink.getRequiredIngredients().stream().filter(drinkDI -> {
				return inventoryIngredients.stream().anyMatch(invDI -> {
					return isAvailableIngredient(invDI, drinkDI);
				});
			}).count();
			
			if (amtIngredients - amtAvailableIngredients == 1) {
				creatableDrinks.add(drink);
			};
		}
		
		return creatableDrinks;
	}
    
    
	
	private boolean isAvailableIngredient(DrinkIngredient inventoryDI, DrinkIngredient drinkDI) {
		if (inventoryDI.getProduct().equals(drinkDI.getProduct())){
			if (inventoryDI.getAmountType().equals(drinkDI.getAmountType())) {
				return inventoryDI.getAmount() >= drinkDI.getAmount();
			}
		}
		
		return false;
	}
    	
}
