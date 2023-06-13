package negocio;

public class Aluno {

	public String nome;
	public String cpf;
	public int matricula;
	public String vertente;

	public Aluno(String nome, String cpf, int matricula, String vertente) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.vertente = vertente;
	}
	
	public void alterarNome(String nome) {
		this.nome = nome;
	}
	
}
