package view;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelAtualizar extends JPanel {

	public PainelAtualizar() {
	  criarFormularioCadastro();
	  this.setBackground(Color.LIGHT_GRAY);
	}

	private void criarFormularioCadastro() {	
		JLabel matricula  = new JLabel("Matricula");
		JTextField caixamatricula= new JTextField(6);
		
		JLabel vertente  = new JLabel("Vertente");
		JTextField caixaVertente= new JTextField(6);
		
		Botao b= new Botao("Atualizar", Color.GREEN);
		
		this.setLayout(new GridLayout(3,2));
		
		this.add(matricula);
		this.add(caixamatricula);
		this.add(vertente);
		this.add(caixaVertente);
		this.add(new JLabel());
		this.add(b);
		
		
		
		
	}
}
