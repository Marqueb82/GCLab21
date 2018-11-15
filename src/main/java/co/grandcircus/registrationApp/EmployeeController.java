package co.grandcircus.registrationApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.registrationApp.dao.EmployeeDao;
import co.grandcircus.registrationApp.entity.Coffee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao emp;

	@RequestMapping("/admin")
	public ModelAndView employeePage() {
		return new ModelAndView("admin");
	}

	@RequestMapping("/menu")
	public ModelAndView employeeAccess() {
		List<Coffee> coffees = emp.findAll();
		return new ModelAndView("menu", "coffees", coffees);
	}

	@RequestMapping("/empAdd")
	public ModelAndView employeeAddScreen() {
		return new ModelAndView("empAdd");
	}

	@RequestMapping("/menu/add")
	public ModelAndView addCoffee(Coffee coffee) {
		emp.create(coffee);
		return new ModelAndView("redirect:/menu");
	}

	@RequestMapping("empEdit")
	public ModelAndView editCoffee(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView("empEdit");
		mav.addObject("coffee", emp.findById(id));
		return mav;
	}

	@RequestMapping("/menu/edit")
	public ModelAndView editCoffeeItem(Coffee coffee, @RequestParam("id") Long id) {
		coffee.setId(id);
		emp.update(coffee);
		return new ModelAndView("redirect:/menu");
	}

	@RequestMapping("/menu/delete")
	public ModelAndView deletedItem(@RequestParam("id") Long id) {
		emp.delete(id);
		return new ModelAndView("redirect:/menu");
	}

}
