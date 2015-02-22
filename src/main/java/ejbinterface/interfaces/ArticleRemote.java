package ejbinterface.interfaces;

import javax.ejb.Remote;

@Remote
public interface ArticleRemote {
	public boolean createArticle(String title, String content);
}
