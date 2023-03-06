package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	//Fun��o recursiva que calcula a somat�ria.
	public static double calculaSoma(int n) {
		// Condi��o de parada: quando o n�mero for igual a 1
				if (n == 1) {
					return 1;
				// Rela��o de chamada dos passos: a soma � feita atrav�s da soma de 1/n com a soma dos termos anteriores (recursivamente).
				} else {
					return (1.0 / n) + calculaSoma(n - 1);
				}
	}
}

	
