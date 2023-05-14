package Questao9;

public class Triangulo extends Forma {

	public Triangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	public int calcularArea() {
		int area=0;
		area = (super.base + super.altura)/2;
		return area;
	}
	
	public String imprimirNome() {
		return "Triangulo";
	}
}
