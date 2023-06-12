package InterfaceGraficaLab2;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PainelBotoes extends JPanel{

	PaginaPrincipal pagina;
	
	public PainelBotoes(PaginaPrincipal pagina) {
		this.pagina = pagina;
		criarBotoes();
		this.setBackground(Color.GRAY);
	}
	
	private void criarBotoes () {
		Botao cadastrar = new Botao("Cadastrar", Color.LIGHT_GRAY);
		cadastrar.addActionListener(new ExibeCadastro(pagina));
		
		Botao listar = new Botao("Listar", Color.LIGHT_GRAY);
		listar.addActionListener(new Listar(pagina));
		
		Botao atualizar = new Botao("Atualizar", Color.LIGHT_GRAY);
		atualizar.addActionListener( new Atualiza(pagina));
		
		Botao deletar = new Botao("Deletar", Color.LIGHT_GRAY);
		deletar.addActionListener(new Deletar(pagina));
		
		this.add(cadastrar);
		this.add(listar);
		this.add(atualizar);
		this.add(deletar);
		
	}
}
