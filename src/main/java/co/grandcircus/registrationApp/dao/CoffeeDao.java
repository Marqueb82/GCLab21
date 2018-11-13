package co.grandcircus.registrationApp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.registrationApp.entity.Coffee;

@Repository
public class CoffeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Coffee> findAll() {
		return jdbcTemplate.query("SELECT * FROM menu_item", new BeanPropertyRowMapper<>(Coffee.class));
	}

}
