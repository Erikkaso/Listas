package Questao4;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	public boolean comprado;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		comprado = false;
	}

	public void comprarProduto() {
		if (comprado != true) {
			comprado = true;
			preco = preco * quantidade;
			if (preco > 100 && preco < 200)
				preco = preco - (preco * 0.1);

			else if (preco > 200 && preco < 500)
				preco = preco - (preco * 0.2);

			else if (preco > 500)
				preco = preco - (preco * 0.25);
			
			System.out.println("Nome: "+nome+"\nPreço total: " +preco);
		} 
		else
			System.out.println("produto ja comprado");
	}
}
