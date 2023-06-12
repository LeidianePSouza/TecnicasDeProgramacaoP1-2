package InterfaceGraficaLab2;

import javax.swing.JButton;
import java.awt.Color;

public class Botao extends JButton{

	public Botao (String texto, Color cor) {
		this.setText(texto);
		this.setOpaque(true);
		this.setBackground(cor);
		
		this.setSize(50, 50);
	}

	public void addActionListener(Deletar deletar) {
		// TODO Auto-generated method stub
		
	}

	public void addActionListener(Listar listar) {
		// TODO Auto-generated method stub
		
	}

	public void addActionListener(Atualiza atualiza) {
		// TODO Auto-generated method stub
		
	}
}
