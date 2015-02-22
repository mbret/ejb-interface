package ejbinterface.interfaces;

import javax.ejb.Local;

@Local
public interface ArticleLocal {
	public boolean createArticle(String title, String content);
}
