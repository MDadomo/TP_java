package metier;
import entities.Villes;

import java.util.List;
import java.util.Scanner;

public class Combat {
	public List creationVille(){

	    Villes villeOne = new Villes(1, 2000, 403 , 44 ,"Nantes", 3);

	    return null;
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
			
		}
		
		/*for (Monster Monster : l){
			Monster.affiche();
		}
		Scanner scJ1 = new Scanner(System.in);
		int sj1 = scJ1.nextInt();
		Monster characterJ1 = l.get(sj1 -1);
		characterJ1.afficheFinal();
		
		return characterJ1;*/
	}

}




   



