package Questao6;

import java.util.ArrayList;

public class Evento {
	ArrayList<Ingresso> lista;
	
	public Evento() {
		lista = new ArrayList<Ingresso>();
	}
	
	public void venderIngresso(Ingresso ticket) {
		lista.add(ticket);
	}
	
	public void calcularPreco() {
		double total=0;
		for (Ingresso ingresso : lista) {
			total += ingresso.valor;
		}
		System.out.println("o valor total eh: "+total);
	}
	
	public void verificarIngressos() {////
		
	}
}
