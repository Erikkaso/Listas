package Questao16;

public class Elevador {
	private int andaratual;
	private int totalAndares;
	private int capacidadeDePessoas;
	private int pessoasElevador;
	
	public Elevador(int capacidadeDePessoas, int totalAndares) {
		this.capacidadeDePessoas = capacidadeDePessoas;
		this.totalAndares = totalAndares;
		this.pessoasElevador =0;
		this.andaratual =0;
	}
	
	public void entra() {
		if(capacidadeDePessoas > pessoasElevador)
			pessoasElevador++;
	}
	
	public void sai() {
		if(pessoasElevador>0)
			pessoasElevador--;
	}
	
	public void Sobe() {
		if(totalAndares>andaratual)
			andaratual++;
	}
	
	public void Desce() {
		if(andaratual>0)
			andaratual--;
	}

	public int getAndaratual() {
		return andaratual;
	}

	public void setAndaratual(int andaratual) {
		this.andaratual = andaratual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidadeDePessoas() {
		return capacidadeDePessoas;
	}

	public void setCapacidadeDePessoas(int capacidadeDePessoas) {
		this.capacidadeDePessoas = capacidadeDePessoas;
	}

	public int getPessoasElevador() {
		return pessoasElevador;
	}

	public void setPessoasElevador(int pessoasElevador) {
		this.pessoasElevador = pessoasElevador;
	}
	
}
