
package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import model.Produto;
import model.ProdutoDAOIMP;

@WebServlet(urlPatterns="/Remover")
public class Remover extends HttpServlet {

	@Override
	public void doGet( HttpServletRequest req,
						HttpServletResponse res){

		ServletContext sc = req.getServletContext();
		String path = req.getRequestURI();
		long id = Long.parseLong(req.getParameter("id"));


		ProdutoDAOIMP s = new ProdutoDAOIMP();
		s.removeProduto(id);
		
		try{
				res.sendRedirect("/app_java/estoque");
			} catch (Exception e){
				System.out.println(e);
			}
		}
	}