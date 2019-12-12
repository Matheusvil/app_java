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



@WebServlet(urlPatterns="/Update.action")
public class Update extends HttpServlet {

	@Override
	public void doGet( HttpServletRequest req,
						HttpServletResponse res){


		try{

			System.out.println(req.getParameter("id"));
		    long id = Long.parseLong(req.getParameter("id"));
			String produto = req.getParameter("produto");
			int quantidade = Integer.parseInt(req.getParameter("quantidade"));
			String unidade = req.getParameter("unidade");
			double preco = Double.parseDouble(req.getParameter("preco"));
			String descricao = req.getParameter("descricao");


			ProdutoDAOIMP s = new ProdutoDAOIMP();
			Produto p = s.getProduto(id);
			System.out.println(p);

			p.setProdnome(produto);
			p.setQuantidade(quantidade);
			p.setUnidade(unidade);
			p.setPreco(preco);
			p.setDescricao(descricao);

			s.updateProduto(p);
			res.sendRedirect("/app_java/estoque");           
		} catch (Exception e){
			System.out.println(e.getStackTrace()[0]);
		}
}
}	




