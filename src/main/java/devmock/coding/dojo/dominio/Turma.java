package devmock.coding.dojo.dominio;

import java.io.Serializable;

public class Turma implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigo;

	private Turno turno;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

}
