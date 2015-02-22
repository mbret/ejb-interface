package ejbinterface.interfaces;

import javax.ejb.Remote;

import ejbinterface.entities.UserShared;

@Remote
public interface UserRemote {

	// Authentification
	public UserShared getUser(String mail, String password);

	// Inscription
	public UserShared createUser(String mail, String password);

    public boolean emailExist(String email);
    
    public boolean test();
}
