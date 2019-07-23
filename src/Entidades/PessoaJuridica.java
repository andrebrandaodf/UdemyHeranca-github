package Entidades;

public class PessoaJuridica extends Contribuente {

	private int qtdFuncionarios;

	PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendimentoAnual, int qtdFuncionarios) {
		super(nome, rendimentoAnual);
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	@Override
	public double taxa() {
		if (qtdFuncionarios > 10) {
			return super.getRendimentoAnual() * 0.14;
		}

		return super.getRendimentoAnual() * 0.16;
	}

}
