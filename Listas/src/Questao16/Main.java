package Questao16;

public class Main {

	public static void main(String[] args) {
		Elevador e = new Elevador(10, 5);
		System.out.println(e.getAndaratual());
		e.Sobe();
		System.out.println("Andar: "+e.getAndaratual()+" Pessoas:"+e.getPessoasElevador());
		e.entra();
		e.entra();
		e.entra();
		e.Sobe();
		System.out.println("Andar: "+e.getAndaratual()+" Pessoas:"+e.getPessoasElevador());
		e.sai();
		e.Sobe();
		System.out.println("Andar: "+e.getAndaratual()+" Pessoas:"+e.getPessoasElevador());
	}

}
