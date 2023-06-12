package InterfaceGraficaLab2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class ExibeCadastro implements ActionListener{

	private PaginaPrincipal frame;
	public ExibeCadastro(PaginaPrincipal frame) {

		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.painelCadastro.setVisible(true);	
		frame.Dados.setVisible(false);
		frame.Atualiza.setVisible(false);
		frame.Deletar.setVisible(false);
	}


}
