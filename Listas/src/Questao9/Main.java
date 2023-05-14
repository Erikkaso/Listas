package Questao9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c = new Circulo(3, 3, 2);
		Quadrado q = new Quadrado(2, 4);
		Triangulo t = new Triangulo(2, 4);
		Retangulo r = new Retangulo(2, 4);
		
		System.out.println(c.calcularArea());
		System.out.println(c.imprimirNome());
		
		System.out.println(q.calcularArea());
		System.out.println(q.imprimirNome());
		
		System.out.println(t.calcularArea());
		System.out.println(t.imprimirNome());
		
		System.out.println(r.calcularArea());
		System.out.println(r.imprimirNome());
	}

}
