package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame{
	
	JPanel panel1;
	JPanel panel2;
	JLabel visor = new JLabel();
	
	public Janela() {
		this.setSize(500, 500);
	//	this.setLayout(new GridLayout(2, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = criarPainel(Color.gray);

		JButton cadastrar = criarBotao(getBackground(), "Cadastrar");
		cadastrar.addActionListener(new FuncaoCadastro());
		JButton listar = criarBotao(getBackground(), "Listar");
		JButton atualizar = criarBotao(getBackground(), "Atualizar");
		JButton deletar = criarBotao(getBackground(), "Deletar");
		
		panel1.add(cadastrar);
		panel1.add(listar);
		panel1.add(atualizar);
		panel1.add(deletar);
		
		panel2 = criarPainel(Color.lightGray);
		panel2.add(visor);

		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	private class FuncaoCadastro implements ActionListener {

		public void actionPerformed(ActionEvent e) {
//			JButton b = (JButton) e.getSource();
//			visor.setText(b.getText());
//			//panel1.setBackground(b.getBackground());
			visor.setText("Matricula:");
			JTextField texto = new JTextField(null);
			texto.setSize(50, 50);
			panel2.add(texto);
		}
	}
	
	
	public JPanel criarPainel(Color c) {
		JPanel p = new JPanel();
		p.setBackground(c);
		return p;
	}
	
	public JButton criarBotao(Color c, String msg) {
		JButton b = new JButton(msg);
		b.setPreferredSize(new Dimension(100,50));
		b.setBackground(c);

		return b;
	}

}
