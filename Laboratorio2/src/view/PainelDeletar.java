package view;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelDeletar extends JPanel {

	public PainelDeletar() {
	  criarFormularioCadastro();
	  this.setBackground(Color.LIGHT_GRAY);
	}

	private void criarFormularioCadastro() {	
		JLabel matricula  = new JLabel("Matricula");
		JTextField caixamatricula= new JTextField(6);
		
		Botao b= new Botao("Deletar", Color.GREEN);
		
		this.setLayout(new GridLayout(2,2));
		
		this.add(matricula);
		this.add(caixamatricula);
		this.add(new JLabel());
		this.add(b);
		
		
		
		
	}
}
