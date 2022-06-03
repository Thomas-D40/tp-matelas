/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.core.entities;


public class Matelas {
    
    private long id;
    private String nom;
    private int longueur;
    private int largeur;
    private int prix;

    public Matelas() {
    }

    public Matelas(long id, String nom, int longueur, int largeur, int prix) {
        this.id = id;
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
        this.prix = prix;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

  

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Matelas{" + "id=" + id + ", nom=" + nom + ", longueur=" + longueur + ", largeur=" + largeur + ", prix=" + prix + '}';
    }
    
    
    
}
