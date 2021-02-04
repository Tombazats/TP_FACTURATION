package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.ClientEntite;


public interface ClientDao {
	void create(ClientEntite p);
	
	List<ClientEntite> getclient();
}
