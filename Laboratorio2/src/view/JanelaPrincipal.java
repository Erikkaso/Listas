package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JanelaPrincipal  extends JFrame{

	private JPanel painelPrincipal;
	
	
	public PainelCadastrar painelCadastrar;
	public JPanel painelListar;
	public JPanel painelAtualizar;
	public JPanel painelDeletar;
	
	public JanelaPrincipal() {
		
		painelCadastrar = new PainelCadastrar();
		
		painelAtualizar = new PainelAtualizar();
		
		painelDeletar = new PainelDeletar();
		
		painelListar = new JPanel();
		painelListar.setBackground(Color.gray);
		
		
		
		this.setSize(600, 300);
		this.setBackground(Color.LIGHT_GRAY);
		
        PainelBotoes painelBotoes = new PainelBotoes(this); 	
		

		painelPrincipal = new JPanel();
		painelPrincipal.setBackground(Color.BLACK);
		painelPrincipal.setVisible(false);

		this.add(painelBotoes, BorderLayout.NORTH);

		
		painelCadastrar.setVisible(false);
		painelAtualizar.setVisible(false);
		painelDeletar.setVisible(false);
		painelCadastrar.setVisible(false);
		JPanel painelGenerico = new JPanel();
		painelGenerico.add(painelCadastrar);
		painelGenerico.add(painelListar);
		painelGenerico.add(painelAtualizar);
		painelGenerico.add(painelDeletar);
		
		this.add(painelGenerico, BorderLayout.CENTER);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
