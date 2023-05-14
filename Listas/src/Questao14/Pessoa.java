package Questao14;

public class Pessoa {
	private String nome;
	private int idade;
	private int dia, mes, ano;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public void ajustaDataDeNascimento(int d, int m, int a) {
		this.dia= d;
		this.mes = m;
		this.ano = a;
	}
	
	public void calcularIdade(int d, int m, int a) {
		if((m - mes)>0)
		idade = a - ano;
		
		else
		idade = a - ano-1;
			
	}
	
	public void informaIdade() {
		System.out.println(idade);
	}
	
	public void informaNome() {
		System.out.println(nome);
	}
}

