package com.douineauj.ecommerce.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.douineauj.ecommerce.dao.ProduitDao;
import com.douineauj.ecommerce.model.Produit;

@RestController
public class ProduitController {
	
	@Autowired
	public ProduitDao produitDao;
	
	@RequestMapping(value="/produits", method=RequestMethod.GET)
	public List<Produit> getProducts() {
		return produitDao.findAll() ;
	}
	
	@GetMapping(value = "/produits/{id}")
	//	@RequestMapping(value = "/produits/{id}", method = RequestMethod.GET)
	  public Produit afficherUnProduit(@PathVariable int id) {
		return produitDao.findById(id);
	}
	
    @PostMapping(value = "/produits")
    public void ajouterProduit(@RequestBody Produit produit) {
         produitDao.save(produit);
    }
}
