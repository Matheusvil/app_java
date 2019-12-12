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


@WebServlet(urlPatterns="/estoque")
public class Estoque extends HttpServlet {

	@Override
	public void doGet( HttpServletRequest req,
						HttpServletResponse res){

		ServletContext sc = req.getServletContext();
		String path = req.getRequestURI();

		try{
				ProdutoDAOIMP b = new ProdutoDAOIMP();
 				List<Produto> produtos = b.getProdutos();
 				req.setAttribute("produtos", produtos);
				sc.getRequestDispatcher("/jsp/estoque.jsp").forward(req, res);            
			} catch (Exception e){
				System.out.println(e);
			}
		}
	}