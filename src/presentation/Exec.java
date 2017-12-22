package presentation;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import donnees.VillesDAO;
import entities.Vainqueur;
import entities.Villes;
import metier.Combat;

public class Exec {
	public static void main(String[] args) throws SQLException {
		Combat main = new Combat();
		VillesDAO bdd = new VillesDAO();
		List l1 = bdd.creationVille();
		try{
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
		
		List lville = main.SelectionJ1(l1,ct,dp,ar);
		String gagnantString = main.combatVilles(lville);
		System.out.println("La ville qui gagne dans ce tournoi est : " + gagnantString + ".");
		}
		catch(java.util.InputMismatchException e){
			System.out.println("Veuillez rentrer des vrais chiffres");
			System.exit(0);
		}
		
	}
}