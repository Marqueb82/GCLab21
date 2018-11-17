package co.grandcircus.registrationApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.grandcircus.registrationApp.dao.CartItemDao;
import co.grandcircus.registrationApp.dao.CoffeeDao;
import co.grandcircus.registrationApp.entity.CartItem;
import co.grandcircus.registrationApp.entity.Coffee;

@Controller
public class CartItemController {

	@Autowired
	private CartItemDao cartItemDao;

	@Autowired
	private CoffeeDao coffeeDao;

	@RequestMapping("/viewcart")
	public ModelAndView viewcart() {
		List<CartItem> cartitems = cartItemDao.cartItems();
		return new ModelAndView("viewcart", "cartitems", cartitems);
	}

	@RequestMapping("/cart/add")
	public ModelAndView cartTest(@RequestParam("id") Long id, RedirectAttributes redir) {
		Coffee coffee = coffeeDao.findById(id);
		CartItem cartitem = new CartItem();

		for (CartItem c : cartItemDao.cartItems()) {
			if (c.getCoffee().getId() == id) {
				Integer quantity = c.getQuantity() + 1;
				c.setQuantity(quantity);
				cartItemDao.update(c);
				return new ModelAndView("redirect:/list-coffee");
			}
		}

		cartitem.setQuantity(1);
		cartitem.setCoffee(coffee);
		cartItemDao.create(cartitem);
		redir.addFlashAttribute("message", "Item added to Cart");
		return new ModelAndView("redirect:/list-coffee");
	}

	@RequestMapping("/cart/delete")
	public ModelAndView removeItem(@RequestParam("id") Long id, RedirectAttributes redir) {

		Coffee coffee = coffeeDao.findById(id);
		cartItemDao.delete(coffee.getId());
		redir.addFlashAttribute("message", "Item deleted from Cart");

		return new ModelAndView("redirect:/list-coffee");

	}

}
