package practice.code;

public class User {
	private Long id;
	private String name;
	private String email;

	public User(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;

	}

	public Long getId() {
		return id;
	}

	public void serId(Long id) {
		this.id = id;
	}

	public String fetName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
