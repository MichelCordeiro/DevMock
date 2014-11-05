package devmock.coding.dojo.dominio;

import java.io.Serializable;

public class Turno implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigo;

	private String nome;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
