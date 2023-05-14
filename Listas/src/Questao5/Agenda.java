package Questao5;

import java.util.ArrayList;

public class Agenda {
	ArrayList<Contato> lista;
	public String nome;
	public String descricao;

	public Agenda(String nome, String descricao) {
		lista = new ArrayList<Contato>();
		this.nome = nome;
		this.descricao = descricao;
	}
}
