package presentation;

import java.sql.SQLException;
import java.util.List;

import entities.Villes;
import metier.Combat;


public class Exec {
	public static void main(String[] args) throws SQLException {
	Combat main = new Combat();
	List l1 = main.creationVille();
	List player1 = main.SelectionJ1(l1);
}
}