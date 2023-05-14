package Questao7;

public class Empregado {
	
	public String nome;
	protected float salario;
	
	public Empregado(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String toString()
	{
		return "nome: " + nome + "\nsalario: " + salario;
	}
	
}
