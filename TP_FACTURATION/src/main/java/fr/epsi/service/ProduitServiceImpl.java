package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.ProduitDao;
import fr.epsi.dao.ProduitDaoImpl;
import fr.epsi.entite.ProduitEntite;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ProduitServiceImpl implements ProduitService {

	@PersistenceContext
	private EntityManager em;
	
	@Resource
    private UserTransaction utx;
	
	public void createproduit(ProduitEntite p) {
		ProduitDao dao=new ProduitDaoImpl(em, utx);
		dao.create(p);
		
	}

	public List<ProduitEntite> getproduits() {
		ProduitDao dao=new ProduitDaoImpl(em, utx);
		return dao.getproduits();
	}
		
}
