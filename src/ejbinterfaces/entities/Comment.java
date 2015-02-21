package ejbinterfaces.entities;

public class Comment {

	private int id;
	private String content;
	private Article article;
	private User auteur;

	public Comment() {
		super();
	}

	public Comment(int id, String content, Article article, User auteur) {
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

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public User getAuteur() {
		return auteur;
	}

	public void setAuteur(User auteur) {
		this.auteur = auteur;
	}

	
	
}
