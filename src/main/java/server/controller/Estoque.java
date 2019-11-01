package server.controller;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import server.model.Produto;

public class Estoque extends HttpServlet{
    @Override
    public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException{
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("produto");     
            EntityManager em = emf.createEntityManager();

            Produto prod1 = new Produto();
            prod1.setNome("Nestle");
            prod1.setPreco(2.10f);
            prod1.setId(9);
            prod1.setQtd(150);
            prod1.setUni("unid.");

            em.getTransaction().begin();
            em.persist(prod1);
            em.getTransaction().commit();

            Query query = em.createQuery("SELECT * FROM produtos");
            List<Produto> produtos = query.getResultList();

            em.close();
            emf.close();
            req.setAttribute("produtos", produtos);
            req.getRequestDispatcher("/view/estoque.jsp").forward(req, res);
        } catch (Exception e) {
            System.out.println("Erro em 10 ou Servlet!\n" + e.toString());
        }
    }
}