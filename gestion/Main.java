package gestion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Demarrage Ecole v2");

        int menu = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Que voulez vous faire ?");
            System.out.println("1 - Voir la liste");
            System.out.println("2 - Ajouter un etudiant");
            System.out.println("3 - Supprimer un etudiant");
            System.out.println("0 - Quitter le programme");
            menu = scanner.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.println("Liste des etudiants: ");
                    break;
            
                default:
                    System.out.println("Action non reconnu");
                    menu = 5;
                    break;
            }

        } while (menu != 0);

        scanner.close();
    }
}
