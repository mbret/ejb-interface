package ejbinterface.interfaces;

import javax.ejb.Local;
import ejbinterfaces.entities.User;

@Local
public interface UserLocal {
	
	public User getUser(String mail, String password);

}
