package com.monprojet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestionUtilisateur {
    ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
    Connexion link = null;

    public GestionUtilisateur(Connexion plink) {
        this.link = plink;
    }

    public void listUtilisateurs () {
        this.reloadListUtilisateurs();

        for(Utilisateur user : this.utilisateurs) {
            System.out.println(user);
        }
    }

    private void reloadListUtilisateurs () {
        try {
            Statement stmt = this.link.connexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, nom, email FROM utilisateurs");
            System.out.println("Listes des utilisateurs:");
            while (rs.next()) {
                try {
                    Utilisateur user = new Utilisateur(rs.getInt("id"), rs.getString("nom"), rs.getString("email"));
                    this.utilisateurs.add(user);
                } catch (IllegalArgumentException e) {
                    // System.out.println("Utilisateur ignoré");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
        }
    }

    public void addUtilisateurs(Utilisateur utilisateur) {
        try {
            String sqlInsert = "INSERT INTO utilisateurs (nom, email) VALUES (?, ?)";
            PreparedStatement pstmtInsert = this.link.connexion.prepareStatement(sqlInsert);
            pstmtInsert.setString(1, utilisateur.getNom());
            pstmtInsert.setString(2, utilisateur.getEmail());
            pstmtInsert.executeUpdate();
            System.out.println("Insertion réussie.");
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
        }
    }
}
