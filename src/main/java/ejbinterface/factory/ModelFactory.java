package ejbinterface.factory;

import ejbinterface.model.ModelAbstract;

import java.util.ArrayList;

/**
 * Created by Maxime on 2/22/2015.
 */
public class ModelFactory {

    public static <H extends ModelAbstract> ArrayList<H> convert(final Class<H> modelClass, ArrayList entities) throws Exception {
        ArrayList<H> beans = new ArrayList<H>();
        for(Object model : entities){
            beans.add( ModelFactory.convert(modelClass, model) );
        }
        return beans;
    }

    public static <H extends ModelAbstract> H convert(final Class<H> modelClass, Object entity) throws Exception{
        H bean = modelClass.newInstance();
        bean.loadFromEntity(entity);
        return bean;
    }
    
}
