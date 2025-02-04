# 1 - Introduction au Java
### Histoire

Java a été créé en 1995 par James Gosling chez Sun Microsystems. Son objectif était de proposer un langage portable et performant, utilisable sur diverses plateformes sans modification du code source. Depuis, Java a évolué et est aujourd'hui détenu par Oracle.

### Caractéristiques principales

- **Portabilité** : Grâce à la machine virtuelle Java (JVM), le code Java peut être exécuté sur n'importe quel système supportant la JVM.
    
- **Programmation orientée objet (POO)** : Java repose sur les concepts de classes, objets, héritage et polymorphisme.
    
- **Sécurité** : Java inclut une gestion avancée des exceptions et un environnement d'exécution protégé.
    
- **Multithreading** : Il permet d'exécuter plusieurs processus en parallèle pour de meilleures performance

### Différences entre Java SE, EE et ME

- **Java SE (Standard Edition)** : Version de base pour les applications de bureau et les outils de développement.
    
- **Java EE (Enterprise Edition)** : Conçu pour les applications web et d'entreprise avec des fonctionnalités avancées (JSP, Servlets, EJB).
    
- **Java ME (Micro Edition)** : Version allégée pour les appareils embarqués et mobiles.

### Installation et configuration de l’environnement

#### Installation du JDK

Le **Java Development Kit (JDK)** est nécessaire pour développer et exécuter des programmes en Java.

1. Rendez-vous sur le site officiel d’[Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) ou [OpenJDK](https://openjdk.org/).
2. Téléchargez la dernière version du JDK compatible avec votre système d’exploitation.
3. Installez le JDK en suivant les instructions.

#### Configuration des variables d’environnement

Pour utiliser Java en ligne de commande, vous devez configurer les variables d’environnement :

1. **Windows** :
    - Allez dans "Paramètres Système Avancés" > "Variables d’environnement".
    - Ajoutez `JAVA_HOME` avec le chemin du dossier d’installation du JDK.
    - Ajoutez `%JAVA_HOME%\bin` à la variable `Path`.
        
2. **Linux / macOS** :
    - Ajoutez ces lignes à votre fichier `~/.bashrc` ou `~/.zshrc` :
        
        ```
        export JAVA_HOME=/chemin/vers/le/jdk
        export PATH=$JAVA_HOME/bin:$PATH
        ```
        
    - Rechargez la configuration avec `source ~/.bashrc`.

#### Vérification

Après l’installation, ouvrez un terminal ou une invite de commandes et exécutez :

```
java --version
javac --version
```

Vous devriez voir s’afficher la version installée de Java et du compilateur.

### Premiers pas avec Java

Votre premier programme :

*HelloWorld.java*
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Pour compiler et exécuter :

```bash
javac HelloWorld.java
java HelloWorld
```

### Les IDES

Pour faciliter le développement, vous pouvez utiliser un IDE comme :
- **Eclipse** : Idéal pour les débutants.
- **IntelliJ IDEA** : Puissant et optimisé pour Java.    
- **VS Code** : Léger et personnalisable avec l’extension Java.

### Syntaxe de base

#### Types de données et variables
```java
int age = 25;
double prix = 19.99;
char lettre = 'A';
boolean estVrai = true;
String message = "Bonjour";
```

#### Les commentaires

* Sur une seule ligne*
```java
public class HelloWorld {
    public static void main(String[] args) {
		// Test ceci est un commentaire
		System.out.println("Hello, World!");
    }
}
```

Des que l'on modifie le programme il faudra le recompiler. A la différence des langages interprété comme le python ou le PHP, une fois le fichier exécutable créé, si on modifie le fichier source, il faut regénérer l'exécutable, c'est la compilation.

```bash
javac HelloWorld.java
java HelloWorld
```

*Sur plusieurs lignes*
```java
public class HelloWorld {
    public static void main(String[] args) {
		/* Test ceci est un commentaire 
		Mais il est sur plusieurs ligne.
		*/
		System.out.println("Hello, World!");
    }
}
```
#### Opérateurs arithmétiques et logiques
```java
int a = 10, b = 5;
int somme = a + b;
boolean resultat = (a > b) && (b < 20);
```

####  Afficher des choses dans la console

```java
System.out.println("Hello, World!")
```

#### Demander des informations à l'utilisateur

On peut demander plusieurs entrées en une seule exécution 

*Ask.java*
```java
import java.util.Scanner;

public class Ask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Création de l'objet Scanner

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine(); // Lecture de la ligne saisie

        System.out.println("Bonjour, " + nom + "!");

        scanner.close(); // Fermeture du scanner
    }
}
```

*AskMulti.java*
```java
import java.util.Scanner;

public class AskMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        System.out.print("Entrez votre taille : ");
        double taille = scanner.nextDouble();

        System.out.println("Bonjour " + prenom + ", vous avez " + age + " ans et vous mesurez " + taille + " m.");

        scanner.close();
    }
}

```

Il se peux que vous ayez des erreurs, à cause des "types". Par exemple age est un entier, il faut donc mettre des chiffres. Mais vous ne pouvez pas empêcher l'utilisateur de taper une lettre. Vous devez donc vérifier une fois la saisie effectué, quelle est correcte.

**Ne faite jamais confiance à l'utilisateur !!**

*VerifierEntree.java*
```java
import java.util.Scanner;

public class VerifierEntree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un nombre entier : ");
        if (scanner.hasNextInt()) {
            int nombre = scanner.nextInt();
            System.out.println("Vous avez entré : " + nombre);
        } else {
            System.out.println("Erreur : Vous devez entrer un nombre entier !");
        }

        scanner.close();
    }
}
```
#### Structures de contrôle

*Condition if/else/else if*
```java
public class ConditionsExample {
    public static void main(String[] args) {
        int age = 18;

        if (age < 18) {
            System.out.println("Vous êtes mineur.");
        } else if (age == 18) {
            System.out.println("Vous venez d'être majeur !");
        } else {
            System.out.println("Vous êtes majeur.");
        }
    }
}
```

*Condition switch*
```java
public class SwitchExample {
    public static void main(String[] args) {
        String jour = "Lundi";

        switch (jour) {
            case "Lundi":
                System.out.println("C'est le début de la semaine.");
                break;
            case "Vendredi":
                System.out.println("C'est bientôt le week-end !");
                break;
            default:
                System.out.println("Jour ordinaire.");
        }
    }
}
```

*Boucle for*
```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

*Boucle while*
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int compteur = 1;

        while (compteur <= 5) {
            System.out.println("Compteur : " + compteur);
            compteur++;
        }
    }
}
```

*Boucle do-while*
```java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int compteur = 1;

        do {
            System.out.println("Compteur : " + compteur);
            compteur++;
        } while (compteur <= 5);
```

Boucle for-each
```java
public class ForEachExample {
    public static void main(String[] args) {
        String[] langages = {"Java", "Python", "C++", "JavaScript"};

        for (String langage : langages) {
            System.out.println("Langage : " + langage);
        }
    }
}
```

*Break et Continue*
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Sort de la boucle quand i == 5
            }
            System.out.println("Itération : " + i);
        }
    }
}

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Saute l'itération quand i == 3
            }
            System.out.println("Itération : " + i);
        }
    }
}
```

#### Fonctions et portée des variables

*Exemple.java*
```java
public class Exemple {
    public static int addition(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int resultat = addition(3, 4);
        System.out.println("Le résultat est : " + resultat);
    }
}
```

### Exercices pratiques

#### Compter les nombres pairs
Écrivez un programme Java qui affiche tous les nombres pairs entre 1 et 20.
- Expliquez pourquoi vous avez choisi cette boucle.

#### Compte à rebours

Créez un programme `CompteARebours.java` qui compte à rebours de **10 à 1** après avoir affiché **"Lancement !"**.

#### Pour aller plus loin

Faire un programme qui:

- Crée un tableau de nombres entiers.
- Calcule la moyenne, la médiane et l'écart-type des valeurs du tableau.
- Trie le tableau et trouve les valeurs minimales et maximales.


#### Correction

```java
import java.util.Arrays;

public class DataManipulation {
    public static void main(String[] args) {
        int[] data = {3, 5, 7, 2, 8, 10, 11, 1, 6, 4};
        
        // Calcul de la moyenne
        double sum = 0;
        for (int value : data) {
            sum += value;
        }
        double mean = sum / data.length;
        System.out.println("Moyenne: " + mean);
        
        // Tri et médiane
        Arrays.sort(data);
        double median;
        if (data.length % 2 == 0) {
            median = (data[data.length / 2] + data[data.length / 2 - 1]) / 2.0;
        } else {
            median = data[data.length / 2];
        }
        System.out.println("Médiane: " + median);
        
        // Écart-type
        double variance = 0;
        for (int value : data) {
            variance += Math.pow(value - mean, 2);
        }
        double stdDev = Math.sqrt(variance / data.length);
        System.out.println("Écart-type: " + stdDev);
        
        // Min et Max
        System.out.println("Min: " + data[0]);
        System.out.println("Max: " + data[data.length - 1]);
    }
}
```
