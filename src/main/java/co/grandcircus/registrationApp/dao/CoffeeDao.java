package co.grandcircus.registrationApp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.registrationApp.entity.Coffee;

@Repository
@Transactional
public class CoffeeDao {

	@PersistenceContext
	EntityManager em;

	public List<Coffee> findAll() {
		return em.createQuery("From Coffee", Coffee.class).getResultList();
	}

	public List<Coffee> findByName(String name) {
		return em.createQuery("FROM Coffee WHERE name = :name", Coffee.class).setParameter("name", name)
				.getResultList();
	}

	public Coffee findById(Long id) {
		return em.find(Coffee.class, id);
	}

	public void create(Coffee coffee) {
		em.persist(coffee);
	}

	public void update(Coffee coffee) {
		em.merge(coffee);
	}

	public void delete(Long id) {
		Coffee coffee = em.getReference(Coffee.class, id);
		em.remove(coffee);
	}

}
