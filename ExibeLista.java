package InterfaceGraficaLab2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExibeLista implements ActionListener{

	private PaginaPrincipal frame;
	
	public ExibeLista(PaginaPrincipal frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.painelCadastro.setVisible(false);
		frame.Dados.setVisible(false);
		frame.Atualiza.setVisible(true);
		frame.Deletar.setVisible(false);
	}}
