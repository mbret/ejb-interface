package ejbinterface.interfaces;

import ejbinterface.model.ArticleShared;

import javax.ejb.Remote;

import java.util.ArrayList;
import java.util.List;

@Remote
public interface ArticleRemote {
	public boolean createArticle(String title, String content);
    public List<ArticleShared> findAll();
}
