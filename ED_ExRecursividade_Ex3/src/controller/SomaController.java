package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	//Função recursiva que calcula a somatória.
	public static double calculaSoma(int n) {
		// Condição de parada: quando o número for igual a 1
				if (n == 1) {
					return 1;
				// Relação de chamada dos passos: a soma é feita através da soma de 1/n com a soma dos termos anteriores (recursivamente).
				} else {
					return (1.0 / n) + calculaSoma(n - 1);
				}
	}
}

	
