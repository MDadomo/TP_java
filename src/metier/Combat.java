package metier;

import java.util.List;
import java.util.Scanner;

import entities.Vainqueur;
import entities.Villes;

public class Combat {
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

        List v = new LinkedList();

        v.add(villeOne);
        v.add(villeDeux);
        v.add(villeTrois);
        v.add(villeQuatre);
        v.add(villeCinq);
        v.add(villeSix);
        v.add(villeSept);
        v.add(villeHuit);

        return v;
	}
    public Villes SelectionJ1(List<Villes> l) {
		
		
		System.out.println("Selectionnez votre département : \n");
		Scanner dpt = new Scanner(System.in);
		int dp = dpt.nextInt();
		System.out.println("Selectionnez votre arrondissement : \n");
		Scanner arr = new Scanner(System.in);
		int ar = arr.nextInt();
		System.out.println("Selectionnez votre canton : \n");
		Scanner can = new Scanner(System.in);
		int ct = can.nextInt();
		if(Villes.getCanton() == ct && Villes.getNom_departement() == dp && Villes.getNom_arrondissement() == ar){
			for (Villes ville : l){
				ville.affiche();
			}
			System.out.println("Selectionnez votre ville : \n");
			Scanner ville = new Scanner(System.in);
			int v = ville.nextInt();
			Villes vj1 = l.get(v);
			vj1.afficheFinal();
			
			return vj1;
		}
		
	}

	public Villes tour (Villes ville1, Villes ville2) {

	    int pointVille1 = (ville1.getNb_habitant() * ville1.getLatitude() * Math.random()*100) / ville1.getNom_ville().length;
	    int pointVille2 = (ville2.getNb_habitant() * ville2.getLatitude() * Math.random()*100) / ville2.getNom_ville().length;

	    if(pointVille1 < pointVille2){
	        return ville1;


        }else if{
	        return ville2;
	    }

    }

	public Vainqueur combatVilles(List<Villes> l){

        int i = 0;
        int j = 0;
        Vainqueur vainqueur = null;
	    while(gagnant == null) {

            if ( (j % 2) == 0) {
                // nbre pair
                int nombreGagnants = l.length()/2;
                for (Villes ville : l){
                    if(l.length == nombreGagnants){
                        i = 0;
                        nombreGagnants = l.lenght/2;
                    }
                    if(l.length == 1){
                        vainqueur = new Vainqueur(ville);
                        return vainqueur;
                    }
                    Villes villeUn = l.get(i);
                    Villes villeDeux = l.get(i+1);
                    Villes perdantMatch = tour(villeUn, villeDeux);
                    if (perdantMatch == villeUn) {
                        l.remove(i);
                    }else if(perdantMatch == villeDeux){
                        l.remove(i+1);
                    }
                }
            } else {
                // nbre impair
            }

        }


    }




}



