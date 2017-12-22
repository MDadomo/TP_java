package entities;

public class Match {
	private Villes ville;
	private Villes adversaire;
	
	public Villes getVille() {
		return ville;
	}
	public void setVille(Villes ville) {
		this.ville = ville;
	}
	public Villes getAdversaire() {
		return adversaire;
	}
	public void setAdversaire(Villes adversaire) {
		this.adversaire = adversaire;
	}
	
	public Match() {
	}
	
	public Match(Villes ville, Villes adversaire){
		setVille(ville);
		setAdversaire(adversaire);
	}


	
}




