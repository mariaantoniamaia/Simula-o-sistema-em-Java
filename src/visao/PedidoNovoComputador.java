package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class PedidoNovoComputador extends JPanel {
	
	private JTextField fieldLotacao;
	private JTextField fieldSala;
	private JTextField fieldRamal;
	private JButton botaoCancelar;
	private JButton botaoEnviar;
	private JTextArea textAreaDescricao;
	private JComboBox<String> comboBoxPredio;
	private JLabel labelTitulo;
	
	/**
	 * Create the panel.
	 */
	public PedidoNovoComputador() {
		setBackground(new Color(182, 188, 248));

		setBounds(100, 100, 665, 658);
		setLayout(new MigLayout("", "[][grow]", "[][40px][][][30px][][][30px][][][30px][][][30px][][][::100px,grow][][]"));
		
		labelTitulo = new JLabel("Solicitação de Novo Computador");
		labelTitulo.setForeground(new Color(0, 0, 0));
		labelTitulo.setBackground(new Color(0, 0, 128));
		labelTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
		add(labelTitulo, "cell 1 1,alignx center,aligny center");
		
		JLabel labelLot = new JLabel("Lotação *");
		labelLot.setForeground(new Color(0, 0, 0));
		labelLot.setFont(new Font("Verdana", Font.BOLD, 14));
		add(labelLot, "cell 1 3");
		
		fieldLotacao = new JTextField();
		add(fieldLotacao, "cell 1 4,grow");
		fieldLotacao.setColumns(10);
		
		JLabel labelSala = new JLabel("Sala *");
		labelSala.setForeground(new Color(0, 0, 0));
		labelSala.setFont(new Font("Verdana", Font.BOLD, 14));
		add(labelSala, "cell 1 6");
		
		fieldSala = new JTextField();
		add(fieldSala, "cell 1 7,grow");
		fieldSala.setColumns(10);
		
		JLabel labelPredio = new JLabel("Prédio *");
		labelPredio.setForeground(new Color(0, 0, 0));
		labelPredio.setFont(new Font("Verdana", Font.BOLD, 14));
		add(labelPredio, "cell 1 9");
		
		comboBoxPredio = new JComboBox<String>();
		add(comboBoxPredio, "cell 1 10,grow");
		
		comboBoxPredio.addItem("");
		comboBoxPredio.addItem("1");
		comboBoxPredio.addItem("2");
		comboBoxPredio.addItem("3");
		
		
		JLabel labelRamal = new JLabel("Ramal *");
		labelRamal.setForeground(new Color(0, 0, 0));
		labelRamal.setFont(new Font("Verdana", Font.BOLD, 14));
		add(labelRamal, "cell 1 12");
		
		fieldRamal = new JTextField();
		add(fieldRamal, "cell 1 13,grow");
		fieldRamal.setColumns(10);
		
		JLabel labelDesc = new JLabel("Descrição *");
		labelDesc.setForeground(new Color(0, 0, 0));
		labelDesc.setFont(new Font("Verdana", Font.BOLD, 14));
		add(labelDesc, "cell 1 15");
		
		textAreaDescricao = new JTextArea();
		add(textAreaDescricao, "cell 1 16,grow");
		
		botaoEnviar = new JButton("Enviar");
		botaoEnviar.setFont(new Font("Verdana", Font.BOLD, 14));
		add(botaoEnviar, "flowx,cell 1 18,alignx center,aligny center");
		
		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setFont(new Font("Verdana", Font.BOLD, 14));
		add(botaoCancelar, "cell 1 18,alignx center,aligny center");

	}

	public JTextField getFieldLotacao() {
		return fieldLotacao;
	}

	public void setFieldLotacao(JTextField fieldLotacao) {
		this.fieldLotacao = fieldLotacao;
	}

	public JTextField getFieldSala() {
		return fieldSala;
	}

	public void setFieldSala(JTextField fieldSala) {
		this.fieldSala = fieldSala;
	}

	public JTextField getFieldRamal() {
		return fieldRamal;
	}

	public void setFieldRamal(JTextField fieldRamal) {
		this.fieldRamal = fieldRamal;
	}

	public JButton getBotaoCancelar() {
		return botaoCancelar;
	}

	public void setBotaoCancelar(JButton botaoCancelar) {
		this.botaoCancelar = botaoCancelar;
	}

	public JButton getBotaoEnviar() {
		return botaoEnviar;
	}

	public void setBotaoEnviar(JButton botaoEnviar) {
		this.botaoEnviar = botaoEnviar;
	}

	public JTextArea getTextAreaDescricao() {
		return textAreaDescricao;
	}

	public void setTextAreaDescricao(JTextArea textAreaDescricao) {
		this.textAreaDescricao = textAreaDescricao;
	}

	public JComboBox<String> getComboBoxPredio() {
		return comboBoxPredio;
	}

	public void setComboBoxPredio(JComboBox<String> comboBoxPredio) {
		this.comboBoxPredio = comboBoxPredio;
	}
	
	public JLabel getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(JLabel labelTitulo) {
		this.labelTitulo = labelTitulo;
	}

	public void limpaTela() {
		fieldLotacao.setText("");
		fieldSala.setText("");
		comboBoxPredio.setSelectedIndex(0);
		fieldRamal.setText("");
		textAreaDescricao.setText("");
	}
}
