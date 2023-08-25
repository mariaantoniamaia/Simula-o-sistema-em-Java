package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Pedido;
import modelo.Usuario;

public class UsuarioDAO {
	private File arqUsu, arqPed;
	private FileWriter fw;
	private BufferedWriter bw;

	public UsuarioDAO() {
		arqUsu = new File("usuarios.txt");
		arqPed = new File("pedidos.txt");
	}

	public boolean autenticarUsuario(Usuario c) {
		boolean resp = false;

		try {
			FileReader fr = new FileReader(arqUsu);
			BufferedReader br = new BufferedReader(fr);

			String linha = null;
			String[] campos = new String[1];

			while ((linha = br.readLine()) != null) {

				campos = linha.split("#");

				if (campos[0].equals(c.getUsuario()) && campos[1].equals(c.getSenha())) {

					resp = true;
					break;
				}
			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return resp;
		} catch (IOException e) {
			e.printStackTrace();
			return resp;
		}
		
		return resp;
	}

	public boolean cadastrarPedido(Pedido p) {

		try {
			fw = new FileWriter(arqPed, true);
			bw = new BufferedWriter(fw);

			bw.write(p.toString());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				fw.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

}
