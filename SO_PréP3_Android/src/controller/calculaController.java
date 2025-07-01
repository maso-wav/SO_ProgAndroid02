package controller;

public class calculaController {

	public static double calculaSerie(int numero) {
		
		int num = 1;
		double soma = 0;
		
		for(int i = 0; i < numero; i++) {
						
			soma = soma + (num/Math.pow(num, 2));
			num++;
		}
		
		return soma;
	}
	
}
