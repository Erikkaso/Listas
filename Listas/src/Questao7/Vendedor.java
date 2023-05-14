package Questao7;

public class Vendedor  extends Empregado{
	
	public double percentualComissao;
	
	public Vendedor(String nome, float salario, double percentualComissao) {
		super(nome,salario);
		this.percentualComissao = percentualComissao;
	}
	
	public float calcularSalario() {
		return (float)(salario +(salario*percentualComissao));
	}
	
	public String toString(Vendedor a)
	{
		return "nome: " + nome + "\nsalario sem comissao: " + salario + "\nsalario com comissao: " + a.calcularSalario() + "\nprecentual da comissao: " + (percentualComissao*100)+"%";
	}
}
