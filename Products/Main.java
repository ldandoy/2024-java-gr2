package Products;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File fichier = new File("Products/liste.txt");
            Scanner lecteur = new Scanner(fichier);
            
            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();
                System.out.println(ligne);
            }
            lecteur.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichier introuvable !");
        }

        try {
            FileWriter ecrivain = new FileWriter("Products/liste.txt", true);
            ecrivain.write("\nFraise");
            // ecrivain. append("Fraise");
            ecrivain.close();
            System.out.println("Écriture terminée.");
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture du fichier.");
        }
    }
}
