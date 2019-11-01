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

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("estoque");     
            EntityManager em = emf.createEntityManager();
/*
            Produto prod1 = new Produto();
            prod1.setId(1L);
            prod1.setName("KitKat");
            prod1.setDescription("O melhor chocolate do mundo!");
            prod1.setCurrency("R$");
            prod1.setPrice(2.500f);
            prod1.setCode("143vji35353");
            prod1.setAmount(150);
            prod1.setUnit("unid.");
            em.getTransaction().begin();
            em.persist(prod1);
            em.getTransaction().commit();
            
            Produto prod2 = new Produto();
            prod2.setId(2L);
            prod2.setName("Snikers");
            prod2.setDescription("Amendoin e Caramelo!");
            prod2.setCurrency("R$");
            prod2.setPrice(3.10f);
            prod2.setCode("570opfkfi9r45");
            prod2.setAmount(200);
            prod2.setUnit("unid.");
            em.getTransaction().begin();
            em.persist(prod2);
            em.getTransaction().commit();
            
            Produto prod3 = new Produto();
            prod3.setId(3L);
            prod3.setName("Chokito");
            prod3.setDescription("Chocolate Chokito");
            prod3.setCurrency("R$");
            prod3.setPrice(1.90f);
            prod3.setCode("57ghu43ty845");
            prod3.setAmount(500);
            prod3.setUnit("unid.");
            em.getTransaction().begin();
            em.persist(prod3);
            em.getTransaction().commit(); */

           /* Produto prod1 = new Produto();
            prod1.setId(4L);
            prod1.setName("Nestle");
            prod1.setDescription("HMMMMM Gostoso!");
            prod1.setCurrency("R$");
            prod1.setPrice(2.500f);
            prod1.setCode("123kml35353");
            prod1.setAmount(150);
            prod1.setUnit("unid.");
            em.getTransaction().begin();
            em.persist(prod1);
            em.getTransaction().commit(); */

            Query query = em.createQuery("SELECT prod FROM produtos prod");
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