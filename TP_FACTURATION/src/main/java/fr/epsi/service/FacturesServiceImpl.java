package fr.epsi.service;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.FacturesDao;
import fr.epsi.dao.FacturesDaoImpl;
import fr.epsi.entite.FacturesEntite;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class FacturesServiceImpl implements FacturesService {
	
	@PersistenceContext
	private EntityManager em;
	
	@Resource
    private UserTransaction utx;
	
	public void createfactures(FacturesEntite p) {
		FacturesDao dao=new FacturesDaoImpl(em, utx);
		dao.create(p);
		
	}

}
