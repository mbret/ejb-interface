package ejbinterface.interfaces;

import ejbinterface.entities.ArticleShared;
import ejbinterface.entities.UserShared;

import javax.ejb.Remote;
import java.util.ArrayList;

@Remote
public interface ArticleRemote {

    public ArrayList<ArticleShared> findAll();

}
