
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
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Impossible de charger le pilote ");
		}
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
		List<Villes> l = new LinkedList<Villes>();
		while (rs.next()) {
			Villes m = new Villes(rs.getInt("ville_canton"), rs.getInt("ville_population_2012"),
					rs.getInt("ville_latitude_deg"), rs.getInt("ville_departement"), rs.getString("ville_nom_reel"),
					rs.getInt("ville_arrondissement"));
			l.add(m);
		}
		con.close();
		return l;
	}
	public void insMatchPair(Villes v1, Villes v2, Villes va1) throws SQLException {
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					System.out.println("Impossible de charger le pilote ");
				}
				Connection con = null;
				try {
					String DBurl = "jdbc:mysql://localhost:3306/tpjava?autoReconnect=true&useSSL=false";
					con = DriverManager.getConnection(DBurl, "root", "");
				} catch (SQLException e) {
					System.out.println("Connection à la base de données impossible");
				}
				Statement statement = con.createStatement();
				statement.executeUpdate("INSERT INTO combat VALUES ('" + v1.getNom_ville() + "','" + v2.getNom_ville() + "','NULL','" + va1.getNom_ville() + "','NULL')");
	}
	public void insMatchImp(Villes v1, Villes v2, Villes v3, Villes va1, Villes va2) throws SQLException {
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					System.out.println("Impossible de charger le pilote ");
				}
				Connection con = null;
				try {
					String DBurl = "jdbc:mysql://localhost:3306/tpjava?autoReconnect=true&useSSL=false";
					con = DriverManager.getConnection(DBurl, "root", "");
				} catch (SQLException e) {
					System.out.println("Connection à la base de données impossible");
				}
				Statement statement = con.createStatement();
				statement.executeUpdate("INSERT INTO combat VALUES ('" + v1.getNom_ville() + "','" + v2.getNom_ville() + "','" + v3.getNom_ville() + "','" + va1.getNom_ville() + "','" + va2.getNom_ville() + "')");
	}
}
