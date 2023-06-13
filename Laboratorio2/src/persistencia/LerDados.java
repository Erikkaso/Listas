package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import negocio.Aluno;

public class LerDados {
	
	 public ArrayList<Aluno> lista;
	 
	 public LerDados() {
	    lista= new ArrayList<Aluno>();
	}

	public void lerDados(String diretorio) {
		try {
			FileReader arquivo = new FileReader(diretorio);
			BufferedReader leitura = new BufferedReader(arquivo);

			while (leitura.ready()) {
				lista.add(separarDadosDosAlunos(leitura.readLine()));
			}

		} catch (Exception e) {
		}
	}

	private Aluno separarDadosDosAlunos(String linha) {
		String dados[] = linha.split(";");
		Aluno a = new Aluno(dados[1], dados[3],Integer.parseInt(dados[0]), dados[2]);
		return a;
	}
}
