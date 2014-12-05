package devmcok.coding.dojo.bdd;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BibliotecaSteps {

	@Autowired
	private Biblioteca biblioteca;

	private int matricula;
	private String nomeAluno;
	private int saldoDevedor;
	private int qtdEmprestimos;

	private boolean valida;

	@Given("Um aluno $nomeAluno de matricula $matricula")
	public void registrarAlunoBiblioteca(String nomeAluno, int matricula) {
		this.nomeAluno = nomeAluno;
		this.matricula = matricula;

	}

	// houver 0 livro atrasado e livros reservados for 4
	@When("houver $saldoDevedor livro atrasado e livros reservados for $qtdEmprestimos")
	public void validaReserva(int saldoDevedor, int qtdEmprestimos) {
		if (saldoDevedor == 0 && qtdEmprestimos < 5) {
			this.valida = true;
		}
	}

	@Then("Livro reservado com sucesso!!! :)")
	public void mostraResultadoFinal() {
		Assert.assertTrue(valida);
	}
}
