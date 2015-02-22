package ejbinterface.interfaces;

import javax.ejb.Remote;

import ejbinterface.model.UserShared;

@Remote
public interface UserRemote{

	// Authentification
	public UserShared getUser(String mail, String password);

    public UserShared findOne(Object id);
    
	// Inscription
	public UserShared save(String mail, String password);

    public void update(UserShared user);
    
    public boolean emailExist(String email);
    
    public boolean test();
}
