package ejbinterface.interfaces;

import ejbinterface.model.ArticleShared;

import javax.ejb.Remote;
import java.util.ArrayList;

@Remote
public interface ArticleRemote {

    public ArrayList<ArticleShared> findAll();

}
