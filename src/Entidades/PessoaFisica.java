package Entidades;

public class PessoaFisica extends Contribuente {

	private Double despesaComSaude;

	PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendimentoAnual, Double despesaComSaude) {
		super(nome, rendimentoAnual);
		this.despesaComSaude = despesaComSaude;
	}
	
	public Double getDespesaComSaude() {
		return despesaComSaude;
	}
	public void setDespesasComSaude(Double despesasComSaude) {
		this.despesaComSaude = despesaComSaude;
	}
	
		
	@Override
	public double taxa() {
		if(super.getRendimentoAnual() < 20000.00) {
			return (getRendimentoAnual()*0.15) - (getDespesaComSaude() * 0.5); 
		}
		else {
			return (getRendimentoAnual()*0.25) - (getDespesaComSaude() * 0.5);
		}

	}

}
