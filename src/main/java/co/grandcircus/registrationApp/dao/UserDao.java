package co.grandcircus.registrationApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.registrationApp.entity.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void create(User user) {
		String sql = "INSERT INTO coffee_users(firstname, lastname, number, email) Values (?, ?, ?, ?)";
		jdbcTemplate.update(sql, user.getFirstname(), user.getLastname(), user.getNumber(), user.getEmail());
	}
}
