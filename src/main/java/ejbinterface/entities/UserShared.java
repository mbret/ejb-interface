package ejbinterface.entities;

public class UserShared {

	private int id;
	private String mail;
	private String password;

	public UserShared() {
		super();
	}

	public UserShared(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
