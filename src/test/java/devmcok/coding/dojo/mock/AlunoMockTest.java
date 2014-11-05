package devmcok.coding.dojo.mock;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import devmock.coding.dojo.dao.AlunoDAO;
import devmock.coding.dojo.dominio.Aluno;

public class AlunoMockTest {

	private AlunoDAO alunoDAO;

	@Mock
	private Aluno aluno;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
}
