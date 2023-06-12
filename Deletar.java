package InterfaceGraficaLab2;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Deletar extends JPanel{

	public Deletar(PaginaPrincipal pagina) {
		// TODO Auto-generated constructor stub
	}
	
	public Deletar() {
		fazerDeletacao();
		this.setBackground(Color.GRAY);
	}
	
	private void fazerDeletacao() {
		JLabel matricula = new JLabel("Matrícula:");
		JTextField caixaMatricula = new JTextField(6);

		Botao b = new Botao("Deletar", Color.green);
		this.setLayout(new GridLayout(5,2));
		this.add(matricula);
		this.add(caixaMatricula);
		this.add(b);
	}

}
