package devmcok.coding.dojo.android.modelo;

import devmock.coding.dojo.android.maquinas.Carro;
import devmock.coding.dojo.android.maquinas.Motor;
import devmock.coding.dojo.android.modelo.Pessoa;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Olá galera");
		Carro carro = new Carro();
		Motor motor = new Motor();
		Pessoa pessoa = new Pessoa();

		carro.setAno(1967);
		carro.setCor("preto");
		carro.setMarca("ford");
		carro.setModelo("mustangshelby");

		System.out.println(carro.getAno());
		System.out.println(carro.getCor());
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
	}
}
