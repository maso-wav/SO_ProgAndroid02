package view;

import controller.calculaController;
import javax.swing.JOptionPane;

public class calculaSerie {

	public static void main(String[] args) {
		
		int numero = -1;
		
		while(numero < 0 || numero > 20 ) {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
			
			if(numero < 0 || numero > 20) {
				
				JOptionPane.showMessageDialog(null, "O número deve estar entre 0 e 20.");
			}
		}		
		
		double resultado = calculaController.calculaSerie(numero);
		
		JOptionPane.showMessageDialog(null, "A soma da série é: " + String.format("%.2f", resultado) + ".");
		
	}
}
