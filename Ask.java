import java.util.Scanner;

public class Ask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Création de l'objet Scanner

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine(); // Lecture de la ligne saisie

        System.out.print("Entrez votre age : ");
        int age = 0;
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
        }
        else {
            System.out.println("Age non correcte !");
            System.exit(0);
        }

        scanner.close(); // Fermeture du scanner

        System.out.println("Bonjour " + nom + " ! Vous avez " + age + " ans");

        if (age > 18) {
            System.out.println("Vous êtes majeur !");
        } else {
            System.out.println("Vous êtes mineur !");
        }

    }
}
