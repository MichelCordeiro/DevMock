package devmock.coding.dojo.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;

	private String matricula;

	private String email;

	private String senha;

	private Turma turma;

	private Aluno(String nome, String matricula, String email, String senha) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.senha = senha;
	}

	private Aluno(String nome, String matricula, String email, String senha,
			Turma turma) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.senha = senha;
		this.turma = turma;
	}

	private Aluno() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
