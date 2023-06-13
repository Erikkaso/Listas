package view;

import negocio.CartelaAluno;
import negocio.Aluno;
import persistencia.Escrever;
import persistencia.LerDados;

public class Main {

	public static void main(String[] args) {

		new JanelaPrincipal();
		
		LerDados ler = new LerDados();
		ler.lerDados("dados/dadosAluno.txt");
		
	}

}
