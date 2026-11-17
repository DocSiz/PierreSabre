package personnage;

public class Humain {
	
	private String nom;
	private String boisson;
	private int argent;
	
	
	
	
	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	protected void setArgent(int nouvelleValeur) {
		argent = nouvelleValeur;
		
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du "+ boisson +".\n");
	}
	public void parler(String texte) {
		System.out.printf("(%s) - %s", nom , texte);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson +" ! GLOUPS !\n");
	}

	public void acheter(String bien, int prix) {
		if (getArgent() >= prix) {
			parler("J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.\n");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.\n");
		}
	}
	
	public void gagnerArgent(int prix) {
		argent = argent + prix;
	}
	
	public void perdreArgent(int prix) {
		argent = argent - prix;
	}

}	
