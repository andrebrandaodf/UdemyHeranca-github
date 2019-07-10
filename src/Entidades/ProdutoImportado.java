package Entidades;

public class ProdutoImportado extends Produto{

		private float taxaAlfandega;
		
		public ProdutoImportado() {
			super();
		}
		
		public ProdutoImportado(String nome, float preco, float taxaAlfandega) {
			super(nome, preco);
			this.taxaAlfandega = taxaAlfandega;
		}
		
		public float getTaxaAlfandega() {
			return taxaAlfandega;
		}
		public void setTaxaAlfandega(float taxaAlfandega) {
			this.taxaAlfandega = taxaAlfandega;
		}
		
		public double precoTotal() {
			return super.getPreco() + this.taxaAlfandega;
		}
}
