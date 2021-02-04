package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.ClientEntite;
import fr.epsi.service.ClientService;


@WebServlet("/listeclient")
public class ClientServlet extends HttpServlet {
	
	@EJB
	private ClientService service;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		if(req.getParameter("action").equals("listeclient")) {
		req.setAttribute("clients", service.getclient());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ListeClientPage.jsp").forward(req, resp);
		
		}
		
		else if(req.getParameter("action").equals("creerclient")) {
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/CreerClientPage.jsp").forward(req, resp);
		}
	    }

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		
		ClientEntite p=new ClientEntite();
		   p.setPrenom(req.getParameter("prenomClient"));
		   p.setNom(req.getParameter("nomClient"));
		   p.setAdresse(req.getParameter("adresseClient"));
		   
		   
		   service.createclient(p);

	    }

}
