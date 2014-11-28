package devmcok.coding.dojo.bdd;

import java.math.BigDecimal;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProuniSteps {

	@Autowired
	private Prouni prouni;

	private BigDecimal number;
	private String nomeAluno;
	private String curso;
	private BigDecimal ponto;
	private boolean valida = true;

	@Given("Registro de aluno $nomeAluno como nota no enem de $ponto e se matricular em $curso")
	public void deveRegistrarAlunoProuni(String nomeAluno, double ponto,
			String curso) {
		this.curso = curso;
		this.nomeAluno = nomeAluno;
		this.ponto = BigDecimal.valueOf(ponto);

	}

	@When("A nota minina permitida e $ponto pela instituicao e o $curso oferecer vaga para prouni")
	public void validaInscricao(double ponto, String curso) {
		if (!this.curso.equalsIgnoreCase("SI") && ponto <= 850) {
			this.valida = false;
		}
	}

	@Then("informar indisponibilidade ao aluno devido a nota igual $notaFinal")
	public void mostraResultadoFinal(double notaFinal) {
		Assert.assertTrue(valida);
	}

	@Given("Registro de um aluno $nomeAluno com nota de $ponto e deseja se matricular em $curso")
	public void deveRegistrarAlunoProuni2(String nomeAluno, double ponto,
			String curso) {
		this.nomeAluno = nomeAluno;
		this.ponto = BigDecimal.valueOf(ponto);
		this.curso = curso;
	}

	@When("a nota minima permitida e $ponto pela instituicao e o $curso oferecer vaga para o prouni")
	public void validaNota() {
		if (ponto.intValue() >= 850 && curso.equals("SI")) {
			this.valida = true;
		}
	}

	@Then("efetivar matricula de aluno no curso com desconto")
	public void efetuaMatricula() {

		Assert.assertTrue(valida);

	}
}
