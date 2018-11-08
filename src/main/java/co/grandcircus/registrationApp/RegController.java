package co.grandcircus.registrationApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegController {

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");
	}

	@RequestMapping("/register")
	public ModelAndView goRegister() {
		return new ModelAndView("register");
	}

	@RequestMapping("/user")
	public ModelAndView theUser(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("number") String number) {

		ModelAndView mv = new ModelAndView("user");
		mv.addObject("name", name);
		mv.addObject("number", number);
		mv.addObject("email", email);

		return mv;

	}
}
