package Questao10_11_12;

public class Main {

	public static void main(String[] args) {
		Empregado e = new Empregado("Walter", "07/09/1958", 45, 30000, 0.3);
		Operario o = new Operario("Bob", "14/07/1986", 12, 2000, 0.2, 300, 0.4);
		Vendedor v = new Vendedor("Peter", "10/08/1962", 5, 1000, 0.1, 120, 0.6);
		
		System.out.println(e.calcularSalario());
		System.out.println(e.nome + "\n" + e.idade + "\n" + e.getCodigoSetor()+"\n");
		
		System.out.println(o.calcularSalario());
		System.out.println(o.nome + "\n" + o.idade + "\n" + o.getCodigoSetor() +"\n");
		
		System.out.println(v.calcularSalario());
		System.out.println(v.nome + "\n" + v.idade + "\n" + v.getCodigoSetor());

	}

}
