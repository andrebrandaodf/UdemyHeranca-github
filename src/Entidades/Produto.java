package Entidades;

public class Produto {

	private String nome;
	private float  preco;
	
	public Produto(){
		
	}
	
	public Produto(String nome, float preco) {
		this.nome  = nome;
		this.preco = preco;
	}
	
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
	
	public String etiqueDePreco() {
		return "Produto: "+this.nome+
				"R$ "+this.preco;
	}
}
