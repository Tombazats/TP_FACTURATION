package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.ProduitEntite;

public interface ProduitService {
	
	List<ProduitEntite> getproduits();
	
	void createproduit(ProduitEntite p);

}
