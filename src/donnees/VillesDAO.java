package donnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import entities.Villes;

public class VillesDAO {
	public List creationVille() throws SQLException {

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
			String DBurl = "jdbc:mysql://localhost:3306/tpjava?autoReconnect=true&useSSL=false";
			con = DriverManager.getConnection(DBurl, "root", "");
		} catch (SQLException e) {
			System.out.println("Connection à la base de données impossible");
		}

		String requete = "SELECT * FROM villes";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(requete);
		} catch (SQLException e) {
			System.out.println("Anomalie lors de l'execution de la requête");
		}

		// parcours des données retournées
		List<Villes> l = new LinkedList<Villes>();
		while (rs.next()) {
			Villes m = new Villes(rs.getInt("ville_canton"), rs.getInt("ville_population_2012"),
					rs.getInt("ville_latitude_deg"), rs.getInt("ville_departement"), rs.getString("ville_nom_reel"),
					rs.getInt("ville_arrondissement"));
			l.add(m);
		}

		// fermeture de la connection
		con.close();

		/*
		 * Villes villeOne = new Villes(1, 2000, 4083 , 44 ,"Nantes", 3); Villes
		 * villeDeux = new Villes(3, 40300, 3703 , 44 ,"St Sebastien sur loire",
		 * 2); Villes villeTrois = new Villes(2, 4600, 3053 , 85
		 * ,"Les Sables D'olonnes", 2); Villes villeQuatre = new Villes(5,
		 * 47650, 303 , 66 ,"Nice", 2); Villes villeCinq = new Villes(7, 408600,
		 * 3303 , 44 ,"St Herblain", 2); Villes villeSix = new Villes(21,
		 * 434000, 3803 , 44 ,"St Bernad", 2); Villes villeSept = new Villes(54,
		 * 40050, 3039 , 44 ,"St luce", 2); Villes villeHuit = new Villes(6,
		 * 40020, 3039 , 44 ,"St Loire", 2); Villes villeNeuf = new Villes(7,
		 * 470600, 3303 , 44 ,"St machin", 2); Villes ville10 = new Villes(7,
		 * 406700, 3303 , 44 ,"St truc", 2); Villes ville11 = new Villes(7,
		 * 406070, 3303 , 44 ,"St nathan", 2);
		 * 
		 * List v = new LinkedList();
		 * 
		 * v.add(villeOne); v.add(villeDeux); v.add(villeTrois);
		 * v.add(villeQuatre); v.add(villeCinq); v.add(villeSix);
		 * v.add(villeSept); v.add(villeHuit); v.add(villeNeuf); v.add(ville10);
		 * v.add(ville11);
		 */

		return l;
	}
}
