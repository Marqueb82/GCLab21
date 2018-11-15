package co.grandcircus.registrationApp.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.registrationApp.entity.User;

@Repository
@Transactional
public class UserDao {

	@PersistenceContext
	EntityManager em;

	public void create(User user) {
		em.persist(user);
	}

	public User findByUsername(String username) {
		try {
			return em.createQuery("FROM User WHERE username = :username", User.class).setParameter("username", username)
					.getSingleResult();
		} catch (NoResultException ex) {
			// No user with that username found.
			return null;
		}
	}
}
