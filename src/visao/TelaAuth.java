package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;

public class TelaAuth extends JPanel {
	
	private JTextField fieldUsuario;
	private JPasswordField fieldSenha;
	private JButton botaoAutenticar;
	private JButton botaoCancelar;

	/**
	 * Create the panel.
	 */
	public TelaAuth() {
		setBackground(new Color(181, 220, 249));
		setBounds(100, 100, 665, 658);
		setLayout(new MigLayout("", "[grow][grow,center][grow]", "[grow][][][][][30px][grow][grow]"));

		JLabel labelUser = new JLabel("Usuário");
		labelUser.setFont(new Font("Verdana", Font.BOLD, 16));
		add(labelUser, "flowy,cell 1 1");

		fieldUsuario = new JTextField();
		add(fieldUsuario, "cell 1 1,grow");
		fieldUsuario.setColumns(10);

		JLabel labelPassword = new JLabel("Senha");
		labelPassword.setFont(new Font("Verdana", Font.BOLD, 16));
		add(labelPassword, "flowy,cell 1 3");

		fieldSenha = new JPasswordField();
		add(fieldSenha, "cell 1 3,grow");

		botaoAutenticar = new JButton("Autenticar");
		botaoAutenticar.setFont(new Font("Verdana", Font.BOLD, 14));
		add(botaoAutenticar, "flowx,cell 1 5,grow");

		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setFont(new Font("Verdana", Font.BOLD, 14));
		add(botaoCancelar, "cell 1 5,grow");

	}

	public JTextField getFieldUsuario() {
		return fieldUsuario;
	}

	public void setFieldUsuario(JTextField fieldUsuario) {
		this.fieldUsuario = fieldUsuario;
	}

	public JPasswordField getFieldSenha() {
		return fieldSenha;
	}

	public void setFieldSenha(JPasswordField fieldSenha) {
		this.fieldSenha = fieldSenha;
	}

	public JButton getBotaoAutenticar() {
		return botaoAutenticar;
	}

	public void setBotaoAutenticar(JButton botaoAutenticar) {
		this.botaoAutenticar = botaoAutenticar;
	}

	public JButton getBotaoCancelar() {
		return botaoCancelar;
	}

	public void setBotaoCancelar(JButton botaoCancelar) {
		this.botaoCancelar = botaoCancelar;
	}

	public void limpaTela() {
		fieldSenha.setText("");
		fieldUsuario.setText("");
	}

}
