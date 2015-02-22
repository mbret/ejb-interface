package ejbinterface.interfaces;

import javax.ejb.Local;
import ejbinterface.entities.UserShared;

@Local
public interface UserLocal {

	// Authentification
	public UserShared getUser(String mail, String password);

	// Inscription
	public boolean createUser(String mail, String password);

}
