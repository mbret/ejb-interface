package ejbinterface.interfaces;

import ejbinterface.model.ArticleShared;
import ejbinterface.model.UserShared;

import javax.ejb.Remote;

import java.util.ArrayList;
import java.util.List;

@Remote
public interface ArticleRemote {
	
    public ArticleShared save(String title, String content, UserShared user);
    
    public List<ArticleShared> findAll();
    
    public ArticleShared findOne(Object id);
}
