package modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String usuario;
	private String senha;
	
	public Usuario(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	public Usuario () {
		
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public List<String> validaCampos() {
		ArrayList<String> listaCampos= new ArrayList<String>();
		
		if(usuario.equals(""))
			listaCampos.add("Usuario");
		if(senha.equals(""))
			listaCampos.add("Senha");
		
		return listaCampos;
	}
	
	public String toString()
	{
		return usuario + "#" + senha;
	}
	
}
