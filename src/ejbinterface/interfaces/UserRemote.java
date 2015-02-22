package ejbinterface.interfaces;

import javax.ejb.Remote;

import ejbinterfaces.entities.UserShared;

@Remote
public interface UserRemote {

	// Authentification
	public UserShared getUser(String mail, String password);

	// Inscription
	public boolean createUser(String mail, String password);

}
