package Questao7;

public class Main {

	public static void main(String[] args) {
		
		Empregado empregado = new Empregado("Mike Ehrmantraut", 7000);
		System.out.println(empregado.toString() +"\n");
		
		Gerente gerente = new Gerente("Gus Fring", 15000, "Los Pollos Hermanos");
		System.out.println(gerente.toString()+"\n");
		
		Vendedor vendedor = new Vendedor("Badger", 600, 0.15);
		System.out.println(vendedor.toString(vendedor)+"\n");
	}

}
