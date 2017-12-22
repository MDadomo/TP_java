package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import entities.Vainqueur;
import entities.Villes;

public class Combat {
	
	public void connection(){
		// Enregistrement en BDD
				// chargement du pilote
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					System.out.println("Impossible de charger le pilote ");
				}

				// connection a la base de données
				Connection con = null;
				try {
					String DBurl = "jdbc:mysql://localhost:3306/gestionnaire?autoReconnect=true&useSSL=false";
					con = DriverManager.getConnection(DBurl, "root", "");
				} catch (SQLException e) {
					System.out.println("Connection à la base de données impossible");
				}
	}
	
	
	
	
	public List creationVille(){

	    //Recuperer toutes les villes d'un canton depuis la bdd puis les ajouter à la liste

	    Villes villeOne = new Villes(1, 2000, 4083 , 44 ,"Nantes", 3);
        Villes villeDeux = new Villes(3, 40300, 3703 , 44 ,"St Sebastien sur loire", 2);
        Villes villeTrois = new Villes(2, 4600, 3053 , 85 ,"Les Sables D'olonnes", 2);
        Villes villeQuatre = new Villes(5, 47650, 303 , 66 ,"Nice", 2);
        Villes villeCinq = new Villes(7, 408600, 3303 , 44 ,"St Herblain", 2);
        Villes villeSix = new Villes(21, 434000, 3803 , 44 ,"St Bernad", 2);
        Villes villeSept = new Villes(54, 40050, 3039 , 44 ,"St luce", 2);
        Villes villeHuit = new Villes(6, 40020, 3039 , 44 ,"St Loire", 2);
        Villes villeNeuf = new Villes(7, 470600, 3303 , 44 ,"St machin", 2);
        Villes ville10 = new Villes(7, 406700, 3303 , 44 ,"St truc", 2);
        Villes ville11 = new Villes(7, 406070, 3303 , 44 ,"St nathan", 2);

        List v = new LinkedList();

        v.add(villeOne);
        v.add(villeDeux);
        v.add(villeTrois);
        v.add(villeQuatre);
        v.add(villeCinq);
        v.add(villeSix);
        v.add(villeSept);
        v.add(villeHuit);
        v.add(villeNeuf);
        v.add(ville10);
        v.add(ville11);

        return v;
	}
    public List SelectionJ1(List<Villes> l) {
		
		
		System.out.println("Selectionnez votre département :");
		Scanner dpt = new Scanner(System.in);
		int dp = dpt.nextInt();
		System.out.println("Selectionnez votre arrondissement : \n");
		Scanner arr = new Scanner(System.in);
		int ar = arr.nextInt();
		System.out.println("Selectionnez votre canton : \n");
		Scanner can = new Scanner(System.in);
		int ct = can.nextInt();
		System.out.println("Voici les villes du canton choisi: \n");
		List r = new LinkedList();
		
		for (Villes ville : l){		
			if(ville.getCanton() == ct && ville.getNom_departement() == dp && ville.getNom_arrondissement() == ar){
				ville.affiche();
				r.add(ville);
			}
		}
		return r;
}

	

	public String combatVilles(List<Villes> l){

        int i = 0;
        int j = l.size();
        Vainqueur vainqueur = null;
	    while(vainqueur == null) {
            if ( (j % 2) == 0) {
                // nbre pair
                int nombreGagnants = l.size()/2;
                for (i = 0; i <=500000;i++){
                    if(l.size() == nombreGagnants){
                        i = 0;
                        nombreGagnants = l.size()/2;
                    }
                    else if(l.size() == 1){
                        String gagnant = (l.get(0).getNom_ville());
                        return gagnant;
                    }
                    if(l.size() > 1){
                    Villes villeUn = l.get(i);
                    Villes villeDeux = l.get(i+1);
                    Villes perdantMatch = tour(villeUn, villeDeux);
                    if (perdantMatch == villeUn) {
                        l.remove(i);
                    }else if(perdantMatch == villeDeux){
                        l.remove(i+1);
                    }
                    
                    }
                    
                }
            } else {
                // nbre impair
            }

        }
	    
	    return "il n'y a pas de vainqueur" ;


    }
	
	public Villes tour (Villes ville1, Villes ville2) {

	    double pointVille1 = (ville1.getNb_habitant() * ville1.getLatitude() * Math.random()*100) / ville1.getNom_ville().length();
	    double pointVille2 = (ville2.getNb_habitant() * ville2.getLatitude() * Math.random()*100) / ville2.getNom_ville().length();

	    if(pointVille1 < pointVille2){
	        return ville1;

	    }
        else if(pointVille1 > pointVille2){
	        return ville2;
	    }
        else{
        	return null;
        }

    }
	
	public void finCombat(Vainqueur g){
		System.out.println("La ville qui gagne dans ce canton est : " + g.getNom_ville()+".");
	}




}



