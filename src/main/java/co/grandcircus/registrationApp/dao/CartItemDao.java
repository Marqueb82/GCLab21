package co.grandcircus.registrationApp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.registrationApp.entity.CartItem;

@Repository
@Transactional
public class CartItemDao {

	@PersistenceContext
	EntityManager em;

	public void create(CartItem cartItem) {
		em.persist(cartItem);
	}

	public List<CartItem> cartItems() {
		return em.createQuery("From CartItem", CartItem.class).getResultList();
	}

	public void update(CartItem cartItem) {
		em.merge(cartItem);
	}

	public void delete(Long id) {
		CartItem cartItem = em.getReference(CartItem.class, id);
		em.remove(cartItem);
	}

}
