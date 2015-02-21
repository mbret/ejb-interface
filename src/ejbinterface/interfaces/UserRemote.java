package ejbinterface.interfaces;

import javax.ejb.Remote;
import ejbinterfaces.entities.User;

@Remote
public interface UserRemote {
	
	public User getUser(String mail, String password);

}
