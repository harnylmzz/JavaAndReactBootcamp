package gameDemo.entitiy;

public class Customer {

	private int id;
	private String userName;
	private String email;
	private String password;

	public Customer() {

	}

	public Customer(int id, String email, String password, String userName) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}