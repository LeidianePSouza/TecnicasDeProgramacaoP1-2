package InterfaceGraficaLab2;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cadastro extends JPanel {

	public Cadastro() {
		fazerCadastro();
		this.setBackground(Color.GRAY);
	}

	private void fazerCadastro() {
		JLabel nome = new JLabel("Nome:");
		JTextField caixaNome = new JTextField(6);
		
		JLabel cpf = new JLabel("CPF:");
		JTextField caixaCPF = new JTextField(6);
		
		JLabel matricula = new JLabel("Matrícula:");
		JTextField caixaMatricula = new JTextField(6);
		
		JLabel vertente = new JLabel("Vertente:");
		JTextField caixaVertente = new JTextField(6);
		
		Botao b = new Botao("Cadastrar", Color.green);
		this.setLayout(new GridLayout(5,2));
		
		this.add(nome);
		this.add(caixaNome);
		this.add(cpf);
		this.add(caixaCPF);
		this.add(matricula);
		this.add(caixaMatricula);
		this.add(vertente);
		this.add(caixaVertente);
		this.add(b);		
	}

					
}

