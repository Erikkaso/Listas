package Questao2;

public class Main {

	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Walter", "White",50000);
		Empregado empregado2 = new Empregado("Jesse", "Pinkman",27000);
		
		System.out.println("salario anual empregado 1: " + (empregado1.getSalario()*12));
		System.out.println("salario anual empregado 2: " + (empregado2.getSalario()*12) +"\n");
		
		double salario = (empregado1.getSalario() * 0.1) + empregado1.getSalario();
		empregado1.setSalario(salario);
		System.out.println("salario anual empregado 1: " + (empregado1.getSalario()*12));
		
		salario = (empregado2.getSalario() * 0.1) + empregado2.getSalario();
		empregado2.setSalario(salario);
		System.out.println("salario anual empregado 2: " + (empregado2.getSalario()*12));
	}

}
