package InterfaceGraficaLab2;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExibeAtualiza implements ActionListener{

private PaginaPrincipal frame;
	
	public ExibeAtualiza(PaginaPrincipal frame) {
		
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		frame.painelCadastro.setVisible(false);
		frame.Dados.setVisible(true);
		frame.Atualiza.setVisible(false);
		frame.Deletar.setVisible(false);	
	}
}
