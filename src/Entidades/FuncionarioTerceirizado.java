package Entidades;

public class FuncionarioTerceirizado extends Funcionario{
	
	private Double adicional;
	
	public FuncionarioTerceirizado(){
		super();
	}
	
	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double adicional){
		super(nome, horas, valorPorHora);
		this.adicional = adicional;
	}
	public  Double getAdicional() {
		return adicional;
	}
	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public final double pagamento() {
		return super.pagamento() + adicional * 1.1;
	}
}	
	
