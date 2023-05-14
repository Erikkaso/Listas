package Questao13;

public class ControleRemoto {
	private int volume;
	private int canal;
	private boolean ligado;
	
	public ControleRemoto(int volume, int canal) {
		this.volume = volume;
		this.canal = canal;
		this.ligado = false;
	}
	
	public void ligarTv(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void aumentarVolume() {
		if(ligado == true && volume <= 100 && volume >= 0)
		volume++;
	}
	
	public void diminuirVolume() {
		if(ligado == true && volume <= 100 && volume >= 0)
		volume--;
	}
	
	public void trocarCanal(int aux) {
		if(ligado == true)
		canal+= 1*aux;
	}
	
	public void escolherCanal(int aux) {
		if(ligado == true)
		canal = aux;
	}
	
	public void consultar() {
		System.out.println("Canal: "+canal +" Volume: "+volume);
	}
	
	public void mute() {
		volume =0;
	}
}
