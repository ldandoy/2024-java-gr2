package com.monprojet;

public class Utilisateur {
    private int id;
    private String nom;
    private String email;

    public Utilisateur(int id, String nom, String email) {
        if (nom == null || nom.trim().isEmpty() || nom.trim().length() < 3) {
            throw new IllegalArgumentException("Le nom doit contenir au moins 3 caractères et ne peut pas être vide.");
        }

        this.id = id;
        this.nom = nom.trim();
        this.email = email.trim();
    }

    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty() || nom.trim().length() < 3) {
            throw new IllegalArgumentException("Le nom doit contenir au moins 3 caractères et ne peut pas être vide.");
        }

        this.nom = nom.trim();
    }

    public String getNom() {
        return this.nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    /*public static boolean isValidNom(String nom) {
        if (!nom.equals("")) {
            return true;
        } else {
            System.out.println("Le nom ne doit pas être vide !");
        }

        return false;
    }*/

    @Override
    public String toString() {
        return "ID:" + this.id + " Nom: " + this.nom + " Email: " + this.email;
    }
}
