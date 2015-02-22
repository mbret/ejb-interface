package ejbinterface.model;

import ejbinterface.factory.ModelFactory;
import ejbpersistance.entities.Article;

import java.util.Date;

public class ArticleShared extends ModelAbstract{

	private int id;
	private String titre;
	private String contenu;
	private UserShared auteur;
    private Date date;
    
	public ArticleShared() {
		super();
	}

	public ArticleShared(int id, String titre, String contenu, UserShared auteur, Date date) {
		super();
		this.id = id;
		this.titre = titre;
		this.contenu = contenu;
		this.auteur = auteur;
        this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
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
        this.id = ((Article)entity).getId();
        this.titre = ((Article)entity).getTitle();
        this.contenu = ((Article)entity).getContent();
        try {
			this.auteur = ModelFactory.convert(UserShared.class, ((Article)entity).getAuteur());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        this.date = ((Article)entity).getDate();
    }
}
