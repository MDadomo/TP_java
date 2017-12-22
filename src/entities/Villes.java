package entities;

public class Villes {

    private int canton;
    private int nb_habitant;
    private int latitude;
    private int nom_departement;
    private String nom_ville;
    private int nom_arrondissement;

    //Constructeurs

    public Villes() {

    }

    public Villes(int canton, int nb_habitant, int latitude, int nom_departement, String nom_ville, int nom_arrondissement) {
        this.canton = canton;
        this.nb_habitant = nb_habitant;
        this.latitude = latitude;
        this.nom_departement = nom_departement;
        this.nom_ville = nom_ville;
        this.nom_arrondissement = nom_arrondissement;
    }

    //Accesseurs


    public int getCanton() {
        return canton;
    }

    public void setCanton(int canton) {
        this.canton = canton;
    }

    public int getNb_habitant() {
        return nb_habitant;
    }

    public void setNb_habitant(int nb_habitant) {
        this.nb_habitant = nb_habitant;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(int nom_departement) {
        this.nom_departement = nom_departement;
    }

    public String getNom_ville() {
        return nom_ville;
    }

    public void setNom_ville(String nom_ville) {
        this.nom_ville = nom_ville;
    }

    public int getNom_arrondissement() {
        return nom_arrondissement;
    }

    public void setNom_arrondissement(int nom_arrondissement) {
        this.nom_arrondissement = nom_arrondissement;
    }


    public void affiche(){
        System.out.println("Nom ville :"+ nom_ville + " - Nombres d'habitants : "+ nb_habitant+ "- Latitude : " + latitude);
    }
    public void afficheFinal(){
        System.out.println("Vous avez choisi "+nom_ville+"\n");
    }



}