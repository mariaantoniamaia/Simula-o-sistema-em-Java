package visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenu menuPROPLAN;
	private CardLayout card;
	private TelaAuth telaAutenticacao = new TelaAuth();
	private PedidoInstalacaoProvisoria pedProv = new PedidoInstalacaoProvisoria();
	private PedidoNovoComputador pedNovo = new PedidoNovoComputador();
	private JPanel janelaInicial = new JPanel();
	private JMenuItem auth;
	private JMenuItem novoComp;
	private JMenuItem instalProvi;
	private JMenuItem exit;
	private JLabel labelPrincipal;

	public JanelaPrincipal() {
		setTitle("Sistema de Pedidos Internos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 658);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuPrincipal = new JMenu("Principal");
		menuBar.add(menuPrincipal);

		auth = new JMenuItem("Autenticar");
		menuPrincipal.add(auth);

		exit = new JMenuItem("Sair");
		menuPrincipal.add(exit);

		JMenu menuASCOM = new JMenu("ASCOM");
		menuASCOM.setEnabled(false);
		menuBar.add(menuASCOM);

		JMenu menuEngenharia = new JMenu("Engenharia");
		menuEngenharia.setEnabled(false);
		menuBar.add(menuEngenharia);

		menuPROPLAN = new JMenu("PROPLAN");
		menuPROPLAN.setEnabled(false);
		menuBar.add(menuPROPLAN);

		novoComp = new JMenuItem("Pedido de Novo Computador");
		menuPROPLAN.add(novoComp);

		instalProvi = new JMenuItem("Pedido de Instalação Provisória");
		menuPROPLAN.add(instalProvi);

		JMenu menuSEI = new JMenu("SEI");
		menuSEI.setEnabled(false);
		menuBar.add(menuSEI);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		card = new CardLayout();
		contentPane.setLayout(card);
		janelaInicial.setBackground(new Color(181, 238, 249));

		contentPane.add(janelaInicial, "inicio");
		janelaInicial.setLayout(new CardLayout(0, 0));
		
		labelPrincipal = new JLabel("Sistema de Pedidos Internos");
		labelPrincipal.setBackground(new Color(179, 231, 251));
		labelPrincipal.setForeground(new Color(0, 0, 0));
		labelPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		labelPrincipal.setFont(new Font("Verdana", Font.BOLD, 32));
		janelaInicial.add(labelPrincipal, "name_820388724154900");
		telaAutenticacao.getBotaoAutenticar().setText("Entrar");
		
		
		contentPane.add(telaAutenticacao, "telaAuth");
		contentPane.add(pedProv, "telaInstalacaoProvisoria");
		contentPane.add(pedNovo, "telaNovoComputador");
	}

	public JMenu getMenuPROPLAN() {
		return menuPROPLAN;
	}

	public void setMenuPROPLAN(JMenu menuPROPLAN) {
		this.menuPROPLAN = menuPROPLAN;
	}

	public TelaAuth getTelaAutenticacao() {
		return telaAutenticacao;
	}

	public void setTelaAutenticacao(TelaAuth telaAutenticacao) {
		this.telaAutenticacao = telaAutenticacao;
	}

	public PedidoInstalacaoProvisoria getPedProv() {
		return pedProv;
	}

	public void setPedProv(PedidoInstalacaoProvisoria pedProv) {
		this.pedProv = pedProv;
	}

	public PedidoNovoComputador getPedNovo() {
		return pedNovo;
	}

	public void setPedNovo(PedidoNovoComputador pedNovo) {
		this.pedNovo = pedNovo;
	}

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

	public JMenuItem getAuth() {
		return auth;
	}

	public void setAuth(JMenuItem auth) {
		this.auth = auth;
	}

	public JMenuItem getNovoComp() {
		return novoComp;
	}

	public void setNovoComp(JMenuItem novoComp) {
		this.novoComp = novoComp;
	}

	public JMenuItem getInstalProvi() {
		return instalProvi;
	}

	public void setInstalProvi(JMenuItem instalProvi) {
		this.instalProvi = instalProvi;
	}
	
	public JMenuItem getExit() {
		return exit;
	}

	public void setExit(JMenuItem exit) {
		this.exit = exit;
	}


	public void chamarTelaAuth() {
		card.show(contentPane, "telaAuth");
	}
	
	public void chamarInicial() {
		card.show(contentPane, "inicio");
	}

	public void chamarTelaNovoPC() {
		card.show(contentPane, "telaNovoComputador");
	}

	public void chamarTelaInstProv() {
		card.show(contentPane, "telaInstalacaoProvisoria");
	}

	public void exit() {
		System.exit(0);
	}

}
