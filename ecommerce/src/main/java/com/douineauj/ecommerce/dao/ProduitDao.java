package com.douineauj.ecommerce.dao;

import java.util.List;

import com.douineauj.ecommerce.model.Produit;

public interface ProduitDao {
	
    public List<Produit> findAll();
    public Produit findById(int id);
    public Produit save(Produit producit);
    
}