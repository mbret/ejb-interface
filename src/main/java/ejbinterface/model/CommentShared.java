package ejbinterface.model;

import java.util.Date;

public class CommentShared extends ModelAbstract{

	private int id;
	private String content;
	private ArticleShared article;
	private UserShared auteur;
    private Date date;
    
	public CommentShared() {
		super();
	}

	public CommentShared(int id, String content, ArticleShared article, UserShared auteur, Date date) {
		super();
		this.id = id;
		this.content = content;
		this.article = article;
		this.auteur = auteur;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public void loadFromEntity(Object entity) {

    }
}
