package ejbinterface.entities;

public class CommentShared {

	private int id;
	private String content;
	private ArticleShared article;
	private UserShared auteur;

	public CommentShared() {
		super();
	}

	public CommentShared(int id, String content, ArticleShared article, UserShared auteur) {
		super();
		this.id = id;
		this.content = content;
		this.article = article;
		this.auteur = auteur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ArticleShared getArticle() {
		return article;
	}

	public void setArticle(ArticleShared article) {
		this.article = article;
	}

	public UserShared getAuteur() {
		return auteur;
	}

	public void setAuteur(UserShared auteur) {
		this.auteur = auteur;
	}

	
	
}
