package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ProdutoUsado extends Produto{
	private Date dataFabricacao;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String priceTag() {
		return getNome() + ", R$ " + getPreco() + ", Data de Fabricação: " + sdf.format(dataFabricacao);
	} 
}
