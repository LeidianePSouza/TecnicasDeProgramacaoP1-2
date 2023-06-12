package InterfaceGraficaLab2;

import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.ActiveEvent;

import javax.swing.JButton;

public class PaginaPrincipal extends JFrame{
	
	private JPanel painelPrincipal;
	
	public Cadastro painelCadastro;
	public JPanel Dados;
	public JPanel Atualiza;
	public JPanel Deletar;

	public PaginaPrincipal() {
		
		painelCadastro = new Cadastro();
		Dados = new Listar();
		Atualiza = new Atualiza();
		Deletar = new Deletar();
		
		Dados = new JPanel();
//		Dados.setBackground(Color.green);
		
		Atualiza = new JPanel();
//		Atualiza.setBackground(Color.green);
		
		Deletar = new JPanel();
//		Deletar.setBackground(Color.green);
		
		this.setSize(600, 400);
		this.setBackground(Color.yellow);
		
		PainelBotoes painelBotoes = new PainelBotoes(this);
		
		painelPrincipal = new JPanel();
		painelPrincipal.setBackground(Color.BLACK);
		painelPrincipal.setVisible(false);
		
		this.add(painelBotoes, BorderLayout.NORTH);
		
		painelCadastro.setVisible(false);
		Dados.setVisible(false);
		Atualiza.setVisible(false);
		Deletar.setVisible(false);
		
		JPanel painelGeral = new JPanel();
		painelGeral.add(painelCadastro);
		painelGeral.add(Dados);
		painelGeral.add(Atualiza);
		painelGeral.add(Deletar);
		
		this.add(painelGeral, BorderLayout.CENTER);
		this.setVisible(true);
	
	}
}
