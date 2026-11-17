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
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.\n");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.\n");
		}
	}
	
	public int gagnerArgent(int prix) {
		return argent += prix;
	}
	
	public int perdreArgent(int prix) {
		return argent -= prix;
	}
}	
