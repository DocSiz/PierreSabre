package personnage;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "Thé" ,argent);
	}

	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...\n");
		int argentV = getArgent();
		setArgent(0);
		return argentV;
	}



	public void recevoir(int argentDonne) {
		gagnerArgent(argentDonne);
		parler(argentDonne + " sous ! Je te remercie généreux donateur!\n");
		
	}
}	
