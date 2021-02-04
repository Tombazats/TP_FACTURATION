package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.ProduitEntite;

public interface ProduitDao {
	void create(ProduitEntite p);
	
	
	List<ProduitEntite> getproduits();
	
}
