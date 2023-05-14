package Questao9;

public class Quadrado extends Forma {

	public Quadrado(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	public int calcularArea() {
		int area = 0;
		area = super.base * super.altura;
		return area;
	}
	
	public String imprimirNome() {
		return "Quadrado";
	}
}
