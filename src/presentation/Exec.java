package presentation;

import java.util.List;

import entities.Villes;
import metier.Combat;


public class Exec {
	Combat main = new Combat();
	List l1 = main.creationVille();
	Villes player1 = main.SelectionJ1(l1);
}
