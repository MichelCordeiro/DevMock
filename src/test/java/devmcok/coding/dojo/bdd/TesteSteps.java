package devmcok.coding.dojo.bdd;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TesteSteps {

	@Autowired
	private Teste teste;

	private BigDecimal number;

	@Given("a number with the value $number")
	public void aNumber(double number) {
		this.number = BigDecimal.valueOf(number);
	}

	@When("the number is multiplied by $otherNumber")
	public void theNumberIsMultipliedBy(double otherNumber) {
		this.number = this.number.multiply(BigDecimal.valueOf(otherNumber));
	}

	@Then("the number should be $result")
	public void theNumberShouldBe(double result) {
		assertEquals(new DecimalFormat("0.00").format(result),
				new DecimalFormat("0.00").format(number.doubleValue()));
	}

}
