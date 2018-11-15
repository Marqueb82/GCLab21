package co.grandcircus.registrationApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // int
	private String customername; // varchar(80)
	private String username; // varchar(80)
	private String password; // varchar(80)

	public User() {
	}

	public User(long id, String firstname, String lastname, String number) {
		this.id = id;
		this.customername = firstname;
		this.username = lastname;
		this.password = number;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", customername=" + customername + ", username=" + username + ", password=" + password
				+ "]";
	}

}
