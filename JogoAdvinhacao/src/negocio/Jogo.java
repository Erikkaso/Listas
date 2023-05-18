package negocio;

import java.util.Random;

import apresentacao.*;

public class Jogo {

	private Jogador jogador;
	private Tela tela;
	private Terminal terminal;
	private int numeroEscolhido;
	private boolean jogando;
	Random gerador = new Random();

	public Jogo() {
		tela = new Tela();
		terminal = new Terminal();
		jogador = new Jogador();
		numeroEscolhido = gerador.nextInt(100)+1;
		jogando = true;
	}

	public void inciarJogoTerminal() {
		jogador.setNome(terminal.entradaNome());
		terminal.mesagem("Seja bem vindo: " + jogador.getNome());
	}

	public void inciarJogoGUI() {
		jogador.setNome(tela.entradaDados("Qual o seu nome?"));
		tela.mesagem("Seja bem vindo: " + jogador.getNome());
		jogadas();
	}

	public int solicitarNumero() {
		try {
			String numero = tela.entradaDados("Informe um numero:");
			if (numero == null)
				System.exit(0);

			return Integer.parseInt(numero);

		} catch (NumberFormatException exception) {
			tela.mesagem("Valor Invalido! Tente outro:");
			solicitarNumero();
			return 0;
		}
	}

	public void jogadas() {
		do {
			jogando = verificarAcerto();
		} while (jogando);

		fimDoJogo();
	}

	private void fimDoJogo() {

		String numeros = "";
		for (Integer numero : jogador.getListaNumeros()) {
			numeros += " - " + numero;
		}
		tela.mesagem("Numeros apostados: " + numeros);

	}

	public boolean verificarAcerto() {
		int numero = solicitarNumero();
		jogador.addNumero(numero);

		if (numero == numeroEscolhido) {
			tela.mesagem("Parabens voce acertou! numero de tentativas: " + (jogador.getNumeroTentativa() + 1));
			return false;
		}
		jogador.setNumeroTentativa();
		tela.mesagem("Deu ruim,  voce errou - Tentativas: " + jogador.getNumeroTentativa());
		
		if (numero < numeroEscolhido) {
			tela.mesagem("tente um numero maior");
		} else {
			tela.mesagem("Tente numero menor");
		}
		return true;
	}
}
