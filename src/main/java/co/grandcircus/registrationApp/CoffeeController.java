package co.grandcircus.registrationApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {

	@Autowired
	CoffeeCatalog coffeeCatalog;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");
	}

	@RequestMapping("/list-coffee")
	public ModelAndView listCoffee(@RequestParam(name = "category", required = false) String category) {
		ModelAndView mav = new ModelAndView("list-coffee");
		if (category == null || category.isEmpty()) {
			mav.addObject("coffees", coffeeCatalog.getAllCoffee());
		} else {
			mav.addObject("coffees", coffeeCatalog.getCoffeeInCategory(category));
		}
		return mav;
	}
}
