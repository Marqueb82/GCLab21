package co.grandcircus.registrationApp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.registrationApp.entity.CartItem;
import co.grandcircus.registrationApp.entity.Coffee;

@Repository
@Transactional
public class CartItemDao {

	@PersistenceContext
	EntityManager em;

	public void create(CartItem cartItem) {
		em.persist(cartItem);
	}

	public List<CartItem> cartItems() {
		return em.createQuery("FROM CartItem", CartItem.class).getResultList();
	}

	public CartItem findById(Long id) {
		return em.find(CartItem.class, id);
	}

	public Coffee findCoffeeId(Long id) {
		return em.find(Coffee.class, id);
	}

	public List<CartItem> findForUserId(Long id) {
		return em.createQuery("FROM CartItem WHERE user.id = :userid", CartItem.class).setParameter("userid", id)
				.getResultList();
	}

	public void update(CartItem cartItem) {
		em.merge(cartItem);
	}

	public void delete(Long id) {
		CartItem cartItem = em.getReference(CartItem.class, id);
		em.remove(cartItem);
	}

}
