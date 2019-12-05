package com.andsomore.issueexchange.entite;

public class Utilisateur {
    private String nom;
    private String prenom;
    private String password;
    private String proffesion;
    private String email;

    public Utilisateur(){};

    public Utilisateur(String nom, String prenom, String proffesion, String email, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.proffesion = proffesion;
        this.email = email;
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
