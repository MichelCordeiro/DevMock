Sample story

Narrative:
Eu como Aluno desejo uma bolsa no Prouni
Para que possa pagar 50% da mensalidade
					 
Scenario:  A scenario is a collection of executable steps of different type

Scenario 1 Prouni: Indisponibilidade
Given Registro de aluno Bruno como nota no enem de 845 e se matricular em SI
When A nota minina permitida e 850 pela instituicao
    e o curso oferecer vaga para prouni
Then  informar indisponibilidade ao aluno devido a nota igual 845
 
Scenario 2 Prouni: disponibilidade
Given Registro de um aluno Toinho com nota de 900 e deseja se matricular em SI
When a nota minima permitida e 850 pela instituicao
    e o curso oferecer vaga para o prouni
Then efetivar matricula de aluno no curso com desconto

 
