public class Voiture {
    private String marque;
    private String modele;
    private String couleur;

    public static String[] colorAutorized = {"Rouge", "Vert", "Gris"};

    public Voiture(String marque, String modele, String couleur) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
    }

    public String getMarque() {
        return this.marque;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public String getModele() {
        return this.modele;
    }
	
	void demarrer() {
        System.out.println("La voiture démarre");
    }

    void accelerer() {
        System.out.println("La voiture accelère");
    }

    void freiner() {
        System.out.println("La voiture freine");
    }
}