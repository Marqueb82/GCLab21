package co.grandcircus.registrationApp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.grandcircus.registrationApp.dao.UserDao;
import co.grandcircus.registrationApp.entity.User;

@Controller
public class UserController {

	@Autowired
	private UserDao userDao;

	@RequestMapping("/login")
	public ModelAndView showLoginForm() {
		return new ModelAndView("login");
	}

	@PostMapping("/login") // same url but passes values on redirect
	// get the username and password from the form when it's submitted.
	public ModelAndView submitLoginForm(@RequestParam("username") String username,
			@RequestParam("password") String password, HttpSession session, RedirectAttributes redir) {

		User user = userDao.findByUsername(username);
		if (user == null) {
			return new ModelAndView("login", "message", "Incorrect username or password");
		}
		if (!user.getPassword().equals(password)) {
			return new ModelAndView("login", "message", "Incorrect username or password");
		}

		// login is for adding to the session
		session.setAttribute("user", user);
		redir.addFlashAttribute("message", "Welcome Back");

		return new ModelAndView("redirect:/list-coffee");

	}

	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session, RedirectAttributes redir) {
		session.invalidate();
		redir.addFlashAttribute("message", "You have logged out.");
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/register")
	public ModelAndView goRegister() {
		return new ModelAndView("register");
	}

	@PostMapping("/user")
	public ModelAndView addUser(User user, @RequestParam("confirm-password") String confirmPassword,
			HttpSession session, RedirectAttributes redir) {

		User currentUser = userDao.findByUsername(user.getUsername());
		if (currentUser != null) {
			// If user already exists, display an error message.
			return new ModelAndView("register", "message", "A user with that username already exists.");
		}

		if (!confirmPassword.equals(user.getPassword())) {
			// If the user or passwords don't match, display an error message.
			return new ModelAndView("register", "message", "Passwords do not match.");
		}

		userDao.create(user);

		// session.
		session.setAttribute("user", user);

		// A flash message will only show on the very next page. Then it will go away.
		redir.addFlashAttribute("message", "Thanks for signing up!");
		return new ModelAndView("redirect:/");
	}
}
