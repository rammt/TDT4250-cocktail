package tdt4250.project.design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import tdt4250.project.model.cocktail.*;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public List<EObject> myService(EObject self) {
    	System.out.println("Hello: " +  self);
    	List<EObject> creatableDrinks = new ArrayList<>();
		List<Drink> drinkList = ((Inventory) self).getParty().getDrinkRegister();
		List<DrinkIngredient> inventoryIngredients = ((Inventory) self).getAvailableIngredients();
		
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
    	
    /*public List<Drink> zetCreatableDrinksForInventory(EObject self) {
		List<Drink> creatableDrinks = new ArrayList<>();
		List<Drink> drinkList = ((Inventory) self).getParty().getDrinkRegister();
		List<DrinkIngredient> inventoryIngredients = ((Inventory) self).getAvailableIngredients();
		
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
	}*/
	
	private boolean isAvailableIngredient(DrinkIngredient inventoryDI, DrinkIngredient drinkDI) {
		if (inventoryDI.getProduct().equals(drinkDI.getProduct())){
			if (inventoryDI.getAmountType().equals(drinkDI.getAmountType())) {
				return inventoryDI.getAmount() >= drinkDI.getAmount();
			}
		}
		
		return false;
	}
	
	public String testService(DrinkIngredient DI) {
		return "4";
	}
    	
}
