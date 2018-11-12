package co.grandcircus.registrationApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CoffeeCatalog {

	private List<Coffee> list = new ArrayList<>();

	public CoffeeCatalog() {
		list.add(new Coffee("Short Black", "Expresso", 5.99));
		list.add(new Coffee("Doppio", "Expresso", 3.99));
		list.add(new Coffee("Cinnamon Dolce Latte", "Latte", 4.75));
		list.add(new Coffee("White Chocolate Mocha", "Mocha", 5.50));
		list.add(new Coffee("Vanilla Caffe", "Latte", 4.99));
	}

	/**
	 * Get list of all foods.
	 */
	public List<Coffee> getAllCoffee() {
		return list;
	}

	/**
	 * Get list of foods in a given category.
	 */
	public List<Coffee> getCoffeeInCategory(String category) {
		List<Coffee> matches = new ArrayList<>();
		for (Coffee ff : list) {
			if (ff.getCategory().equalsIgnoreCase(category)) {
				matches.add(ff);
			}
		}
		return matches;
	}

}
