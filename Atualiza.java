package InterfaceGraficaLab2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Atualiza extends JPanel{

	public Atualiza() {
		fazerAtualizacao();
		this.setBackground(Color.GRAY);
	}
	
	public Atualiza(PaginaPrincipal pagina) {
		
	}
	
	private void fazerAtualizacao() {
		JLabel matricula = new JLabel("Matrícula: ");
		JTextField caixaMatricula = new JTextField(6);
		
		JLabel vertente = new JLabel("Vertenete: ");
		JTextField caixaVertente = new JTextField(6);
		
		Botao b = new Botao("Atualizar", Color.green);
		
		this.setLayout(new GridLayout(5,2));
		
		this.add(matricula);
		this.add(caixaMatricula);
		this.add(vertente);
		this.add(caixaVertente);
		this.add(b);
	}
	
	

}
