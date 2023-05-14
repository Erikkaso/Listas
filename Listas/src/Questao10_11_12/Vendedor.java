package Questao10_11_12;

public class Vendedor extends Empregado {
	
	int valorVendas;
	double comissao;
	
	public Vendedor(String nome, String idade, int codigoSetor, int salarioBase, double imposto, int valorVendas, double comissao) {
		super(nome, idade, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double calcularSalario() {
		double salario=0, totalComissao;
		totalComissao = valorVendas*comissao;
		salario = super.getSalarioBase() - (super.getSalarioBase() * super.getImposto()) + totalComissao;
		
		return salario;
	}

}
