package Questao5;

public class Contato {
	public int codigo;
	public String nome;
	public String endereco;
	private String email;
	private String telefone;
	public String observacao;
	
	public Contato(int codigo){
		if(codigo>=1000 && codigo < 9999)
		this.codigo = codigo;
		else
		System.out.println("codigo invalido");
	}
	
	public Contato(int codigo, String nome){
		if(codigo>=1000 && codigo < 9999)
		this.codigo = codigo;
		else
		System.out.println("codigo invalido");
		this.nome = nome;
	}

	public Contato(int codigo, String nome, String email){
		if(codigo>=1000 && codigo < 9999)
		this.codigo = codigo;
		else
		System.out.println("codigo invalido");
		this.nome = nome;
		this.email = email;
	}

	public Contato(String telefone){
		if(telefone.length() == 8)
		this.telefone = telefone;
		else
		System.out.println("telefone invalido");
	}

	public String getEmail() {
		return email;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void imprimir()
	{
		System.out.println(codigo + " " + nome + " " + endereco + " " + email + " " + telefone + " " + observacao);
	}
	
	public Contato duplicarContato(Contato vazio) {//////
		vazio.codigo = this.codigo;
		vazio.nome = this.nome;
		vazio.endereco = this.endereco;
		vazio.telefone = this.telefone;
		vazio.observacao = this.observacao;
		
		return vazio;
	}
	
	public boolean verificarPreenchimento() {
		if(codigo!=0 && nome != null && endereco != null && email != null && telefone != null && observacao != null)
		return true;
		else
		return false;
	}
	
}
