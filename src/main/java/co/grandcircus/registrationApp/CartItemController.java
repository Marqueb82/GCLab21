package co.grandcircus.registrationApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView cartTest(@RequestParam("id") Long id) {
		Coffee coffee = coffeeDao.findById(id);
		CartItem c = new CartItem();
		c.setQuantity(1);
		c.setCoffee(coffee);
		cartItemDao.create(c);
		return new ModelAndView("redirect:/viewcart");
	}

}
