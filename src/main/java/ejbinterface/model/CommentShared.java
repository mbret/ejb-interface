package ejbinterface.model;

import java.util.Date;

import ejbinterface.factory.ModelFactory;
import ejbpersistance.entities.Article;
import ejbpersistance.entities.Comment;
import ejbpersistance.entities.User;

public class CommentShared extends ModelAbstract{

	@Override
	public String toString() {
		return "CommentShared [id=" + id + ", content=" + content
				+ ", article=" + article + ", auteur=" + auteur + ", date="
				+ date + "]";
	}

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
    	this.id = ((Comment)entity).getId();
		this.content = ((Comment)entity).getContent();
		try {
			this.article = ModelFactory.convert(ArticleShared.class, ((Comment)entity).getArticle());
			this.auteur = ModelFactory.convert(UserShared.class, ((Comment)entity).getUser());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        this.date = ((Comment)entity).getDate();
    }
}
