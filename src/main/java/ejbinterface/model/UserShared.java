package ejbinterface.model;

public class UserShared extends ModelAbstract {

	private int id;
	private String mail;
	private String password;
    private boolean subscriber;
            
	public UserShared() {
		super();
	}

    public UserShared(int id) {
        this.id = id;
    }

    public UserShared(String mail, String password, boolean subscriber) {
		super();
		this.mail = mail;
		this.password = password;
        this.subscriber = subscriber;
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

    public boolean isSubscriber() {
        return subscriber;
    }

    public void setSubscriber(boolean subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void loadFromEntity(Object entity) {

    }
}
