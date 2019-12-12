package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity(name="Produto")
@Table
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name="prodnome")
	private String prodnome;


	@Column(name="quantidade")
	private int quantidade;

	@Column(name="unidade")
	private String unidade;

	@Column(name="preco")
	private double preco;

	@Column(name="descricao")
	private String descricao;

	public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    } 

    public String getProdnome(){
    	return prodnome;
    }

    public void setProdnome(String prodnome){
    	this.prodnome = prodnome;
    }

    public int getQuantidade(){
    	return quantidade;
    }
    public void setQuantidade(int quantidade){
    	this.quantidade = quantidade;
    }

    public String getUnidade(){
    	return unidade;
    }

    public void setUnidade(String unidade){
    	this.unidade = unidade;
    }

    public double getPreco(){
    	return preco;
    }

    public void setPreco(double preco){
    	this.preco = preco;
    }

    public String getDescricao(){
    	return descricao;
    }

    public void setDescricao(String descricao){
    	this.descricao = descricao;
    }


}
