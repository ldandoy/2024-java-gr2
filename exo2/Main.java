import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Demande des infos à l'utilisateur
        Scanner scanner = new Scanner(System.in); // Création de l'objet Scanner
        System.out.print("Entrez la couleur : ");
        String couleur = scanner.nextLine();
        scanner.close(); // Fermeture du scanner

        boolean found = false;
        for(String color : Voiture.colorAutorized) {
            if (color.equals(couleur)) {
                found = true;
                break;
            }
        }

        if (found) {
            // Création de la voiture
            Voiture voiture = new Voiture("Toyota", "Corolla", "Rouge");
            
            // Affichage des infos de la voiture
            System.out.println(voiture.getMarque() + " " + voiture.getModele() + " " + voiture.getCouleur());
        } else {
            System.out.println("Erreur dans le choix de la couleur !");
            System.exit(1);
        }
    }
}