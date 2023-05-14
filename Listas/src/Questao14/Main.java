package Questao14;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Albert Einstein");
		Pessoa p2 = new Pessoa("Isaac Newton");
		
		p1.ajustaDataDeNascimento(14, 3, 1879);
		p2.ajustaDataDeNascimento(4, 1, 1643);
		
		p1.calcularIdade(13, 5, 2023);
		p2.calcularIdade(13, 5, 2023);
		
		p1.informaNome();
		p1.informaIdade();
		
		p2.informaNome();
		p2.informaIdade();
	}

}
