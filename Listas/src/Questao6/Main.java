package Questao6;

public class Main {

	public static void main(String[] args) {
		 Ingresso ticket = new Ingresso(20.5);
		 Ingresso ticket2 = new Ingresso(25.5);
		 Ingresso ticket3 = new Ingresso(30.5);
		 
		 System.out.println(ticket.toString());
		 
		 IngressoVip ticketVip = new IngressoVip(20.5);
		 System.out.println(ticketVip.toString());
		 
		 Evento evento = new Evento();
		 evento.venderIngresso(ticket);
		 evento.venderIngresso(ticket2);
		 evento.venderIngresso(ticket3);
		 
		 evento.calcularPreco();
		 
	}

}
