package Questao13;

public class Main {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto(30, 3);
		c.ligarTv(true);
		c.aumentarVolume();
		c.aumentarVolume();
		c.diminuirVolume();
		c.trocarCanal(1);
		c.consultar();
		
		c.escolherCanal(5);
		c.mute();
		c.consultar();
	}

}
