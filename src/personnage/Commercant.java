package personnage;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson = "thé", argent);
	}

	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...\n");
		int argentV = argent;
		argent = 0;
		return argentV;
	}

	public void recevoir(int argentDonné) {
		argent += argentDonné;
		parler(argentDonné + " sous ! Je te remercie généreux donateur!\n");
		
	}
}	
