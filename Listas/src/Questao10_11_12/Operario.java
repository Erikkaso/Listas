package Questao10_11_12;

public class Operario extends Empregado {

	int valorProducao;
	double comissao;
	
	public Operario(String nome, String idade, int codigoSetor, int salarioBase, double imposto, int valorProducao, double comissao) {
		super(nome, idade, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double calcularSalario() {
		double salario=0, totalComissao;
		totalComissao = valorProducao*comissao;
		salario = super.getSalarioBase() - (super.getSalarioBase() * super.getImposto()) + totalComissao;
		
		return salario;
	}
}
