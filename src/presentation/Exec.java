package presentation;

import java.sql.SQLException;
import java.util.List;
import entities.Vainqueur;
import entities.Villes;
import metier.Combat;


public class Exec {
	public static void main(String[] args) throws SQLException {
	Combat main = new Combat();
	List l1 = main.creationVille();
	List lville = main.SelectionJ1(l1);
	String gagnantString = main.combatVilles(lville);
	System.out.println("La ville qui gagne dans ce tournoi est : " + gagnantString + ".");
}
}