package negocio;

import java.util.ArrayList;

public class CartelaAluno {

	private ArrayList<Aluno> listaAluno;
	
	public CartelaAluno() {
		listaAluno= new ArrayList<Aluno>();
	}
	
	public void addAluno(Aluno a) {
		listaAluno.add(a);
	}
	
	public void setListaAluno(ArrayList<Aluno> lista) {
		listaAluno= lista;
	}
	
	public int quantidadeAluno() {
		return listaAluno.size();
	}
	
	public String formatarDados() {
		
		String saida="";
		for (Aluno aluno : listaAluno) {
			saida += aluno.nome +";  "+ aluno.cpf +" \n" ;
		}
		return saida;
	}
	
	
	
}
