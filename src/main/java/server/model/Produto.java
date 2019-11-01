package server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="produto")
public class Produto {
    @Id   
    private  int id;
    @Column(name="nome")
    private  String nome;
    @Column(name="unidade")
    private  String unidade;
    @Column(name="preco")
    private  float preco;
    @Column(name="quantidade")
    private int qtd;
    
    
    public Produto(){}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getUni() {
        return unidade;
    }
    public void setUni(String unidade) {
        this.unidade = unidade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQtd(int qtd){
        return qtd;
    }
	public void setQtd(int qtd) {
        this.qtd = qtd;
	}  
}