package exo1;

// Voiture.java
public class Voiture {
    // Attributs
    public String marque;
    public String modele;
    public String couleur;

    public Voiture() {}

    // Méthodes
    public void demarrer() {
        System.out.println("La voiture démarre");
    }
	
	public void accelerer() {
        System.out.println("La voiture accelère");
    }

    public void freiner() {
        System.out.println("La voiture freine");
    }
}