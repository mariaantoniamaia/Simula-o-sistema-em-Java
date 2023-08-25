package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dao.UsuarioDAO;
import modelo.Pedido;
import modelo.Usuario;
import visao.JanelaPrincipal;

public class UsuarioControle implements ActionListener {

	private JanelaPrincipal janela;
	private Usuario usu;
	private UsuarioDAO usudao;
	private Pedido ped;
	private int tipo = 0;

	public UsuarioControle(Usuario usu, JanelaPrincipal jan, Pedido ped) {

		this.janela = jan;
		this.usu = usu;
		this.ped = ped;
		usudao = new UsuarioDAO();
		this.janela.getAuth().addActionListener(this);
		this.janela.getNovoComp().addActionListener(this);
		this.janela.getInstalProvi().addActionListener(this);
		this.janela.getExit().addActionListener(this);
		this.janela.getTelaAutenticacao().getBotaoAutenticar().addActionListener(this);
		this.janela.getTelaAutenticacao().getBotaoCancelar().addActionListener(this);
		this.janela.getPedProv().getBotaoEnviar().addActionListener(this);
		this.janela.getPedProv().getBotaoCancelar().addActionListener(this);
		this.janela.getPedNovo().getBotaoEnviar().addActionListener(this);
		this.janela.getPedNovo().getBotaoCancelar().addActionListener(this);
	}

	public void autenticarUsuario() {

		String usuario = janela.getTelaAutenticacao().getFieldUsuario().getText();
		@SuppressWarnings("deprecation")
		String senha = janela.getTelaAutenticacao().getFieldSenha().getText();

		usu.setUsuario(usuario);
		usu.setSenha(senha);

		if (usu.validaCampos().size() > 0) {
			System.out.println("Campos " + usu.validaCampos() + " estão em branco!");
		} else {
			if (usudao.autenticarUsuario(usu)) {
				janela.getMenuPROPLAN().setEnabled(true);
			}

			else {
				System.out.println("Usuário não encontrado!");
				janela.getTelaAutenticacao().limpaTela();
			}

		}

	}

	public void cadastrarPedidoInstalacao() {
		tipo = 2;
		String lotacao = janela.getPedProv().getFieldLotacao().getText();
		String sala = janela.getPedProv().getFieldSala().getText();
		String predio = janela.getPedProv().getComboBoxPredio().getSelectedItem().toString();
		String ramal = janela.getPedProv().getFieldRamal().getText();
		String descricao = janela.getPedProv().getTextAreaDescricao().getText();

		ped.setTipo(tipo);
		ped.setLotacao(lotacao);
		ped.setSala(sala);
		ped.setPredio(predio);
		ped.setRamal(ramal);
		ped.setDescricao(descricao);

		if (ped.validaCampos().size() > 0) {
			System.out.println("Campos " + ped.validaCampos() + " estão em branco!");
		} else {
			if (usudao.cadastrarPedido(ped)) {
				System.out.println("Cadastro realizado!");
				janela.getPedProv().limpaTela();
			}

			else {
				System.out.println("Erro ao cadastrar!");
				janela.getPedProv().limpaTela();
			}
		}
	}

	public void cadastrarPedidoPC() {
		tipo = 1;
		String lotacao = janela.getPedNovo().getFieldLotacao().getText();
		String sala = janela.getPedNovo().getFieldSala().getText();
		String predio = janela.getPedNovo().getComboBoxPredio().getSelectedItem().toString();
		String ramal = janela.getPedNovo().getFieldRamal().getText();
		String descricao = janela.getPedNovo().getTextAreaDescricao().getText();

		ped.setTipo(tipo);
		ped.setLotacao(lotacao);
		ped.setSala(sala);
		ped.setPredio(predio);
		ped.setRamal(ramal);
		ped.setDescricao(descricao);

		if (ped.validaCampos().size() > 0) {
			System.out.println("Campos " + ped.validaCampos() + " estão em branco!");
		} else {
			if (usudao.cadastrarPedido(ped)) {
				System.out.println("Cadastro realizado!");
				janela.getPedNovo().limpaTela();
			}

			else {
				System.out.println("Erro ao cadastrar!");
				janela.getPedNovo().limpaTela();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Cancelar")) {

			janela.chamarInicial();

		} else if (e.getActionCommand().equals("Entrar")) {

			autenticarUsuario();

		} else if (e.getActionCommand().equals("Autenticar")) {

			janela.chamarTelaAuth();

		} else if (e.getActionCommand().equals("Sair")) {

			janela.exit();

		} else if (e.getActionCommand().equals("Pedido de Novo Computador")) {
			tipo = 1;
			janela.chamarTelaNovoPC();

		} else if (e.getActionCommand().equals("Pedido de Instalação Provisória")) {
			tipo = 2;
			janela.chamarTelaInstProv();

		} else if (e.getActionCommand().equals("Enviar")) {

			switch (tipo) {
			case 1: {
				cadastrarPedidoPC();
				break;
			}
			case 2: {
				cadastrarPedidoInstalacao();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + tipo);
			}
		}

	}
}
