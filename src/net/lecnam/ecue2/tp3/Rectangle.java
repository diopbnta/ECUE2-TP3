package net.lecnam.ecue2.tp3;

public class Rectangle {



    // attributs
    private double longueur;
    private double largeur;
    private Point origine;

    // constructeur
    public Rectangle(double longueur, double largeur, Point origine) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.origine = origine;
    }
    // constructeur 2
    public Rectangle(double x, double y, double longueur, double largeur) {
        this.origine = new Point(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }



}
