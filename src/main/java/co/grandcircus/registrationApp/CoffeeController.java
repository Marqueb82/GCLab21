package co.grandcircus.registrationApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.registrationApp.dao.CoffeeDao;
import co.grandcircus.registrationApp.entity.Coffee;

@Controller
public class CoffeeController {

	@Autowired
	private CoffeeDao coffeedao;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");
	}

	@RequestMapping("/list-coffee")
	public ModelAndView listCoffee() {
		List<Coffee> coffees = coffeedao.findAll();
		return new ModelAndView("list-coffee", "coffees", coffees);
	}

}
