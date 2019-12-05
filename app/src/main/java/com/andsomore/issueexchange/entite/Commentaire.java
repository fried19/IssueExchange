package com.andsomore.issueexchange.entite;

public class Commentaire {
    private String nomCommentariste;
    private String prenomCommentariste;
    private String datePosteCommentaire;
    private String message;
    private String idUtilisateur;
    private  String nombreLike;

    public Commentaire(){}

    public Commentaire(String nomCommentariste, String prenomCommentariste, String datePosteCommentaire, String message, String idUtilisateur) {
        this.nomCommentariste = nomCommentariste;
        this.prenomCommentariste = prenomCommentariste;
        this.datePosteCommentaire = datePosteCommentaire;
        this.message = message;
        this.idUtilisateur = idUtilisateur;
    }

    public String getNomCommentariste() {
        return nomCommentariste;
    }

    public void setNomCommentariste(String nomCommentariste) {
        this.nomCommentariste = nomCommentariste;
    }

    public String getPrenomCommentariste() {
        return prenomCommentariste;
    }

    public void setPrenomCommentariste(String prenomCommentariste) {
        this.prenomCommentariste = prenomCommentariste;
    }

    public String getDatePosteCommentaire() {
        return datePosteCommentaire;
    }

    public void setDatePosteCommentaire(String datePosteCommentaire) {
        this.datePosteCommentaire = datePosteCommentaire;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(String idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNombreLike() {
        return nombreLike;
    }

    public void setNombreLike(String nombreLike) {
        this.nombreLike = nombreLike;
    }
}
