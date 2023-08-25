package controle;

import modelo.Pedido;
import modelo.Usuario;
import visao.JanelaPrincipal;

public class App {

	public static void main(String[] args) {
		
		JanelaPrincipal i = new JanelaPrincipal();
		i.setVisible(true);
		
		Usuario usu = new Usuario();
		Pedido ped = new Pedido();

		new UsuarioControle(usu, i, ped);
	}
}
