package co.grandcircus.registrationApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.registrationApp.dao.UserDao;
import co.grandcircus.registrationApp.entity.User;

@Controller
public class UserController {

	@Autowired
	private UserDao userDao;

	@RequestMapping("/register")
	public ModelAndView goRegister() {
		return new ModelAndView("register");
	}

	@PostMapping("/user")
	public ModelAndView addUser(User user) {

		userDao.create(user);
		return new ModelAndView("user");
	}
}
