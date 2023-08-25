package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String lotacao;
	private String sala;
	private String predio;
	private String ramal;
	private String descricao;
	private int tipo;

	public Pedido(String lotacao, String sala, String predio, String ramal, String descricao, int tipo) {
		super();
		this.lotacao = lotacao;
		this.sala = sala;
		this.predio = predio;
		this.ramal = ramal;
		this.descricao = descricao;
		this.tipo = tipo;
	}

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public String getLotacao() {
		return lotacao;
	}

	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getPredio() {
		return predio;
	}

	public void setPredio(String predio) {
		this.predio = predio;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public List<String> validaCampos() {

		ArrayList<String> listaCampos = new ArrayList<String>();

		if (lotacao.equals(""))
			listaCampos.add("Lotação");
		if (sala.equals(""))
			listaCampos.add("Sala");
		if (predio.equals(""))
			listaCampos.add("Prédio");
		if (ramal.equals(""))
			listaCampos.add("Ramal");
		if (descricao.equals(""))
			listaCampos.add("Descrição");

		return listaCampos;
	}

	public String toString() {
		return tipo + "#" + lotacao + "#" + sala + "#" + predio + "#" + ramal + "#" + descricao;
	}
}
