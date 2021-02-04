package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.ClientEntite;

public interface ClientService {
	
	List<ClientEntite> getclient();
	
	void createclient(ClientEntite p);

}
