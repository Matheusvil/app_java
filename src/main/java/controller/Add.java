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



@WebServlet(urlPatterns="/Addprod.action")
public class Add extends HttpServlet {

	@Override
	public void doGet( HttpServletRequest req,
						HttpServletResponse res){


		try{
			String produto = req.getParameter("produto");
			int quantidade = Integer.parseInt(req.getParameter("quantidade"));
			String unidade = req.getParameter("unidade");
			double preco = Double.parseDouble(req.getParameter("preco"));
			String descricao = req.getParameter("descricao");

			Produto p = new Produto();
			p.setProdnome(produto);
			p.setQuantidade(quantidade);
			p.setUnidade(unidade);
			p.setPreco(preco);
			p.setDescricao(descricao);

			ProdutoDAOIMP s = new ProdutoDAOIMP();

			s.addProduto(p);
			res.sendRedirect("/app_java/estoque");           
		} catch (Exception e){
			System.out.println(e);
		}
}
}	




