package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import model.Produto;

public class ProdutoDAOIMP {
	        
	public List<Produto> getProdutos(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");        
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT p FROM Produto p");
	    List<Produto> produtos = query.getResultList();
	    em.close();
	    emf.close();
	    return produtos;
    }

    public void updateProduto(Produto produto){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");        
		EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
		em.merge(produto);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public void addProduto(Produto produto){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");        
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        em.close();
        emf.close(); 
    }

    public void removeProduto(long id){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");        
		EntityManager em = emf.createEntityManager();
		Produto p = em.find(Produto.class, id);
    	em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public Produto getProduto(long id){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");        
		EntityManager em = emf.createEntityManager();
		Produto p = em.find(Produto.class, id);
        em.close();
        emf.close();
        return p;
    }

    public void compra(){
    	
    }
}  