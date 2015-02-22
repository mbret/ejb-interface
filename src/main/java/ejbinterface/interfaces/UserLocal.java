package ejbinterface.interfaces;

import javax.ejb.Local;
import ejbinterface.model.UserShared;

@Local
public interface UserLocal {

	// Authentification
	public UserShared getUser(String mail, String password);

	// Inscription
	public UserShared createUser(String mail, String password);

}
