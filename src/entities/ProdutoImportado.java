package entities;

public final class ProdutoImportado extends Produto{
	private Double taxaAlfandega;
	
	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	@Override
	public String priceTag() {
		return getNome() + ", R$ " + precoTotal() + " Taxa: R$ " + taxaAlfandega;
	}
	
	public Double precoTotal() {
		return getPreco() + taxaAlfandega;
	}
}
