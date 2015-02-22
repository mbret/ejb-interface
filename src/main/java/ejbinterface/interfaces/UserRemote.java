package ejbinterface.interfaces;

import javax.ejb.Remote;

import ejbinterface.model.UserShared;

@Remote
public interface UserRemote{

	public UserShared findOne(String mail, String password) throws Exception;

    public UserShared findOne(Object id) throws Exception;
    
	// Inscription
	public UserShared save(String mail, String password) throws Exception;

    public void update(UserShared user);
    
    public boolean emailExist(String email);
    
}
