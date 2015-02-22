package ejbinterface.model;

import java.io.Serializable;

/**
 * Created by Maxime on 2/22/2015.
 */
public abstract class ModelAbstract implements Serializable{
    
    public abstract void loadFromEntity(Object entity);
}
