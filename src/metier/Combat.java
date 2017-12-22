package metier;

import java.util.LinkedList;
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
        Villes villeNeuf = new Villes(7, 408600, 3303 , 44 ,"St machin", 2);

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

        return v;
	}
    public Villes SelectionJ1(List<Villes> l) {
		
		
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
		for (Villes ville : l){		
			if(ville.getCanton() == ct && ville.getNom_departement() == dp && ville.getNom_arrondissement() == ar){
				ville.affiche();		
			}
		}
		
		System.out.println("Selectionnez votre ville : \n");
		Scanner vl = new Scanner(System.in);
		int v = vl.nextInt();
		Villes vj1 = l.get(v);
		vj1.afficheFinal();
		
		return vj1;
}

	public Vainqueur combatVilles(List<Villes> v, Villes vj1){

	    


	    return null;
    }


}



