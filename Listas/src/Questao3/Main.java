package Questao3;

public class Main {

	public static void main(String[] args) {
		Fatura fatura1 = new Fatura(123,"Placa de Video show",3,1500);
		
		System.out.println(fatura1.getValorFatura());
		
		fatura1.desconto(0.5);
		System.out.println(fatura1.getValorFatura());
	}

}
