package controller;

import javax.servlet.ServletException;
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
import com.google.gson.Gson;

@WebServlet(urlPatterns="/getProduto")
public class getProduto extends HttpServlet {

	@Override
	public void doGet( HttpServletRequest req,
						HttpServletResponse res) throws ServletException{

		ServletContext sc = req.getServletContext();
		String path = req.getRequestURI();
		long id = Long.parseLong(req.getParameter("id"));

		try{
			ProdutoDAOIMP s = new ProdutoDAOIMP();
			Produto p = s.getProduto(id);
			String json = new Gson().toJson(p);
			res.setContentType("application/json");
			res.setCharacterEncoding("UTF8");
				
			res.getWriter().write(json);
		}
	  	catch (Exception e) {	
	  		System.out.println(e);
	  	}
	}
}