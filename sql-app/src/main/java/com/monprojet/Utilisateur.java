package com.monprojet;

public class Utilisateur {
    private int id;
    private String nom;
    private String email;

    public Utilisateur(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public boolean isValidNom() {
        if (!this.nom.equals("")) {
            return true;
        }

        return false;
    }

    public void __String() {
        System.out.println("Nom: " + this.nom + " " + this.email);
    }
}
