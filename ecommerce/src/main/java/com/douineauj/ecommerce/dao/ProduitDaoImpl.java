package com.douineauj.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.douineauj.ecommerce.model.Produit;

@Repository
public class ProduitDaoImpl implements ProduitDao {

	public static List<Produit> produits = new ArrayList<>();
	
	static {
		produits.add(new Produit(1, new String("Ordinateur portable"), 350));
		produits.add(new Produit(2, new String("Aspirateur Robot"), 500));
		produits.add(new Produit(3, new String("Table de Ping Pong"), 750));
	}

	@Override
	public List<Produit> findAll() {
		return produits;
	}

	@Override
	public Produit findById(int id) {
		for (Produit produit : produits) {
			if (produit.getId() == id) {
				return produit;
			}
		}
		return null;
	}

	@Override
	public Produit save(Produit produit) {
		produits.add(produit);
		return produit;
	}

}
