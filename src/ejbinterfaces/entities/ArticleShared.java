package ejbinterfaces.entities;

public class ArticleShared {

	private int id;
	private String titre;
	private String contenu;
	private UserShared auteur;

	public ArticleShared() {
		super();
	}

	public ArticleShared(int id, String titre, String contenu, UserShared auteur) {
		super();
		this.id = id;
		this.titre = titre;
		this.contenu = contenu;
		this.auteur = auteur;
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
	
	

}
