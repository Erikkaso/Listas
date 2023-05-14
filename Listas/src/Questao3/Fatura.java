package Questao3;

public class Fatura {
	private int numeroItem;
	private String descricao;
	private int quantidade;
	private double precoUnit;
	private double precoTotal;
	
	public Fatura(int numeroItem, String descricao, int quantidade, float precoUnit) {
		this.numeroItem = numeroItem;
		this.descricao = descricao;
		
		if(quantidade<0)
		this.quantidade = 0;
		else
		this.quantidade = quantidade;
		
		if(precoUnit<0)
		this.precoUnit = 0;
		else
		this.precoUnit = precoUnit;
	}

	public int getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if(quantidade<0)
		this.quantidade = 0;
		else
		this.quantidade = quantidade;
	}

	public double getPrecoUnit() {
		return precoUnit;
	}

	public void setPrecoUnit(double precoUnit) {
		if(precoUnit<0)
		this.precoUnit = 0;
		else
		this.precoUnit = precoUnit;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public double getValorFatura()
	{
		this.precoTotal = precoUnit * quantidade;
		return precoTotal;
	}
	
	public void desconto(double porcentagem)
	{
		precoUnit = precoUnit-(precoUnit * porcentagem);
	}
	
}
