package ejbinterfaces.entities;

public class Article {

	private int id;
	private String titre;
	private String contenu;
	private User auteur;

	public Article() {
		super();
	}

	public Article(int id, String titre, String contenu, User auteur) {
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

	public User getAuteur() {
		return auteur;
	}

	public void setAuteur(User auteur) {
		this.auteur = auteur;
	}
	
	

}
