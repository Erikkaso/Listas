package Questao5;

public class Main {

	public static void main(String[] args) {
		Contato contato1 = new Contato(1234,"Cebolinha","cenoulinha123@gmail.com");
		//System.out.println(contato1.getEmail());
		
		Contato contato2 = new Contato(1200,"Cascao","ecabanho@gmail.com");
		
		contato2.imprimir();
		
		contato1.duplicarContato(contato2);
		
		contato2.imprimir();
		
		contato1.endereco = "Bairro do Limoeiro - Nº25";
		contato1.observacao = "Ligar apenas se tiver algum plano infalivel";
		//System.out.println(contato1.getTelefone()); n tem telefone
		System.out.println(contato1.verificarPreenchimento());
	}

}
