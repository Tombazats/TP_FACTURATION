package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.ProduitEntite;
import fr.epsi.service.ProduitService;


@WebServlet("/listeproduit")
public class ProduitServlet extends HttpServlet{
	
	@EJB
	private ProduitService service;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {	
		if(req.getParameter("action").equals("list")) {
			req.setAttribute("produits", service.getproduits());
			
			   this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ListeProduitPage.jsp").forward(req, resp);	
		}
		
		else if(req.getParameter("action").equals("creer")) {
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/CreerProduitPage.jsp").forward(req, resp);	
			
		}
		
	    }

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		
		ProduitEntite p=new ProduitEntite();
		   p.setPrix(req.getParameter("prixProduit"));
		   p.setNom(req.getParameter("nomProduit"));
		   
		   
		   service.createproduit(p);

	    }
}
