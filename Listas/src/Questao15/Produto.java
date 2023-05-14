package Questao15;

public class Produto {
	String nome;
	float precoCusto;
	float precoVenda;
	float margemDeLucro;
	float despesas;
	
	public Produto(String nome, float precoCusto , float precoVenda, float despesas) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.despesas = despesas;
	}
	
	public float calculoLucros() {
		margemDeLucro = ((precoVenda - (precoCusto + despesas))/precoVenda)*100;
		
		return margemDeLucro;
	}
}
