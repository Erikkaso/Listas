package Questao9;

public class Retangulo extends Forma {

	public Retangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	public int calcularArea() {
		int area=0;
		area = super.base + super.altura;
		return area;
	}
	
	public String imprimirNome() {
		return "Retangulo";
	}
}
