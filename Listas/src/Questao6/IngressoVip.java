package Questao6;

public class IngressoVip extends Ingresso {
	
	private double valorExtra = 20;
	public IngressoVip(double valor) {
		super(valor);
		super.valor += valorExtra;
	}
}
