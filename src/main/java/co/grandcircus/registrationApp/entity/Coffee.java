package co.grandcircus.registrationApp.entity;

public class Coffee {

	private long id; // int
	private String name; // varchar(80)
	private String description; // varchar(80)
	private double price; // double

	public Coffee() {
	}

	public Coffee(long id, String name, String description, double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coffee [id=" + id + ", name=" + name + ", description=" + description + ", cost=" + price + "]";
	}

}
