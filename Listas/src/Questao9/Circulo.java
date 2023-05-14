package Questao9;

public class Circulo extends Forma {

	int raio;
	public Circulo(int base, int altura, int raio) {
		super(base, altura);
		this.raio = raio;
	}
	
	public int calcularArea() {
		int area=0;
		area = (int)3.14 * (raio*raio);
		return area;
	}
	
	public String imprimirNome() {
		return "Circulo";
	}
}
