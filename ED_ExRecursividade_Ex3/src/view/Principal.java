package view;

import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		
		SomaController sc = new SomaController();
		
		// Recebendo um n�mero inteiro como par�metro
		int n = 5;
		double calculaSoma = sc.calculaSoma(n);
		
		// Imprimindo a soma
		System.out.println("Soma = " + calculaSoma); 
	}

}
