package com.douineauj.ecommerce.model;

import java.io.Serializable;

public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nom;
	private float prix;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Produit() {
		super();
	}
	
	public Produit(int id, String nom, float prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", prix=" + prix + "]";
	}
	
}
