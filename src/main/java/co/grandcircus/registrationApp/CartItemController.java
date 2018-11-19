package co.grandcircus.registrationApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.grandcircus.registrationApp.dao.CartItemDao;
import co.grandcircus.registrationApp.dao.CoffeeDao;
import co.grandcircus.registrationApp.entity.CartItem;
import co.grandcircus.registrationApp.entity.Coffee;
import co.grandcircus.registrationApp.entity.User;

@Controller
public class CartItemController {

	@Autowired
	private CartItemDao cartItemDao;

	@Autowired
	private CoffeeDao coffeeDao;

	@RequestMapping("/viewcart")
	public ModelAndView viewcart(@SessionAttribute(name = "user", required = false) User user,
			RedirectAttributes redir) {

		if (user == null) {
			// if not, send them back to the login page with a message.
			redir.addFlashAttribute("message", "Wait! Please log in.");
			return new ModelAndView("redirect:/login");
		}

		List<CartItem> cartitems = cartItemDao.findForUserId(user.getId());
		return new ModelAndView("viewcart", "cartitems", cartitems);
	}

	@RequestMapping("/cart/add")
	public ModelAndView cartTest(@SessionAttribute("user") User user, @RequestParam("id") Long id,
			RedirectAttributes redir) {

		if (user == null) {
			// if not, send them back to the login page with a message.
			redir.addFlashAttribute("message", "Wait! Please log in.");
			return new ModelAndView("redirect:/login");
		}

		Coffee coffee = coffeeDao.findById(id);
		CartItem cartitem = new CartItem();

		cartitem.setQuantity(1);
		cartitem.setCoffee(coffee);
		cartitem.setUser(user);
		System.out.println(user.toString());
		cartItemDao.create(cartitem);
		redir.addFlashAttribute("message", "Item added to Cart");
		return new ModelAndView("redirect:/viewcart");
	}

	@RequestMapping("/cart/delete")
	public ModelAndView removeItem(@RequestParam("id") Long id, RedirectAttributes redir) {

		Coffee coffee = coffeeDao.findById(id);
		cartItemDao.delete(coffee.getId());
		redir.addFlashAttribute("message", "Item deleted from Cart");

		return new ModelAndView("redirect:/viewcart");

	}

}
