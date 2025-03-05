package com.monprojet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    // Informations de connexion
    String url = "jdbc:mysql://localhost:3306/mabasegr2"; // Remplacer "maBase" par le nom de votre base
    String utilisateur = "root";
    String motDePasse = "root";
    Connection connexion = null;

    public Connexion () {
        try {
            // Établir la connexion
            this.connexion = DriverManager.getConnection(this.url, this.utilisateur, this.motDePasse);
            System.out.println("Connexion réussie !");
            
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
            this.close();
            System.exit(1);
        }
    }

    public void close() {
        if (this.connexion != null) { 
            try { 
                this.connexion.close(); 
                System.out.println("Connexion fermée avec succès."); 
            } catch (SQLException e) { 
                System.err.println("Erreur lors de la fermeture de la connexion : " + e.getMessage()); 
            } 
        } 
    }
}
