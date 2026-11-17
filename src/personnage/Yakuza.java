package personnage;

public class Yakuza extends Humain{
	
	private int reputation=4;
	private String clan;
	

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	

	public String getClan() {
		return clan;
	}
	

	public int getReputation() {
		return reputation;
	}
	 


	public void extorquer(Commercant victime) {
		int argentVo = victime.seFaireExtorquer();
		setArgent(getArgent() + argentVo);
		parler("J’ai piqué les " + argentVo + " sous de "+ victime.getNom() +", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !\n");
		reputation = getReputation() + 1;
		
	}
	
	public int perdre() {
		int argentPe = getArgent();
		parler("J’ai perdu mon duel et mes "+argentPe+" sous, snif... J'ai déshonoré le clan de "+getClan()+".\n");
		setArgent(0);
		reputation = getReputation() - 1;
		return argentPe;
	}
	
	public void gagner(int gain) {
		setArgent(getArgent()+gain);
		reputation = getReputation() + 1;
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+getClan()+" ? Je l'ai dépouillé de ses "+gain+" sous.\n");
	}



}
