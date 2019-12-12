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



@WebServlet(urlPatterns="/Comprar")
public class Compra extends HttpServlet {

	@Override
	public void doPost( HttpServletRequest req,
						HttpServletResponse res){



		String produtosComprados = req.getParameter("listProd");
		produtosComprados = produtosComprados.replaceAll("\\[", "");
		produtosComprados = produtosComprados.replaceAll("\\]", "");
		produtosComprados = produtosComprados.replaceAll("\\,", " ");
		String[] p = produtosComprados.split(" ");
		int[] prodComp = new int[p.length];

		for(int i = 0; i<p.length; i++){
			prodComp[i] = Integer.parseInt(p[i]);
		}

			
		int id;
		int qnt;

		try{

			ProdutoDAOIMP b = new ProdutoDAOIMP();
		 	for(int i = 0; i<prodComp.length; i+=2){
			 	id = prodComp[i];
			 	qnt = prodComp[i+1];
			 	
			 	System.out.println(id +" <- id | qnt -> " +qnt);
			 	Produto pr = b.getProduto(id);
			 	int qntAtual = pr.getQuantidade(); 
			 	pr.setQuantidade(qntAtual - qnt);
			 	b.updateProduto(pr);
			 }

			res.sendRedirect("/app_java/");           
		} catch (Exception e){
			System.out.println(e.getStackTrace()[0]);
		}
}
}	




