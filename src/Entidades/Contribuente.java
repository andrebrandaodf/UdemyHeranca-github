package Entidades;

public abstract class Contribuente {

	private String nome;
	private Double rendimentoAnual;
	
	public Contribuente() {
		
	}
	
	public Contribuente(String nome, Double rendimentoAnual) {
		this.nome            = nome;
		this.rendimentoAnual = rendimentoAnual;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	public Double getRendimentoAnual() {
		return this.rendimentoAnual;
	}
	
	public void setRendimentoAnual(Double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}
	
	public abstract void taxa();
}
