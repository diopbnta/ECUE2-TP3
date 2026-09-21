package net.lecnam.ecue2.tp3;

public class Dessin {
    private Rectangle[] rectangles;
    private int nombreRectangles;

    public Dessin(){
        rectangles = new Rectangle[10];
        nombreRectangles = 0;
    }
    // TROUVER un emplacement par rapport au nombre de de rectangle déja placé
    public void ajout(Rectangle rectangle) {
        rectangles[nombreRectangles] = rectangle;
        nombreRectangles++;
    }
}

