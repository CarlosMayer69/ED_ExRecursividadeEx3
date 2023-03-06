package view;

import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		
		SomaController sc = new SomaController();
		
		// Recebendo um número inteiro como parâmetro
		int n = 5;
		double calculaSoma = sc.calculaSoma(n);
		
		// Imprimindo a soma
		System.out.println("Soma = " + calculaSoma); 
	}

}
