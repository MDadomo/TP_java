package entities;

public class Vainqueur {
	private Villes vainqueur;

	public Villes getVainqueur() {
		return vainqueur;
	}

	public void setVainqueur(Villes vainqueur) {
		this.vainqueur = vainqueur;
	}
	
	public Vainqueur() {	
	}
	
	public Vainqueur(Villes vainqueur){
		setVainqueur(vainqueur);
	}
	
}


