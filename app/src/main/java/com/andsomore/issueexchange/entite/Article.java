package com.andsomore.issueexchange.entite;

import java.util.Date;

public class Article {
  private  String titre;
  private  String contenu;
  private  Date   datePoste;
  private  String langage;
  private  String idUtilisateur;
  private  int    nombreLike;
  public  Article(){}

  public Article(String titre, String contenu, Date datePoste, String langage, String idUtilisateur) {
    this.titre = titre;
    this.contenu = contenu;
    this.datePoste = datePoste;
    this.langage = langage;
    this.idUtilisateur = idUtilisateur;
  }

  public String getTitre() {
    return titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public String getContenu() {
    return contenu;
  }

  public void setContenu(String contenu) {
    this.contenu = contenu;
  }

  public Date getDatePoste() {
    return datePoste;
  }

  public void setDatePoste(Date datePoste) {
    this.datePoste = datePoste;
  }

  public String getLangage() {
    return langage;
  }

  public void setLangage(String langage) {
    this.langage = langage;
  }

  public String getIdUtilisateur() {
    return idUtilisateur;
  }

  public void setIdUtilisateur(String idUtilisateur) {
    this.idUtilisateur = idUtilisateur;
  }

  public int getNombreLike() {
    return nombreLike;
  }

  public void setNombreLike(int nombreLike) {
    this.nombreLike = nombreLike;
  }
}
