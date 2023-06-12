package InterfaceGraficaLab2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExibeDeletar implements ActionListener {

	private PaginaPrincipal frame;
	
	public ExibeDeletar(PaginaPrincipal frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.painelCadastro.setVisible(false);
		frame.Dados.setVisible(false);
		frame.Atualiza.setVisible(false);
		frame.Deletar.setVisible(true);
	}
}
