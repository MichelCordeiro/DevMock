package devmock.coding.dojo.dao;

import devmock.coding.dojo.dominio.Aluno;

public interface AlunoDAO {

	Aluno recuperarPorMatricula(String matricula);

}
