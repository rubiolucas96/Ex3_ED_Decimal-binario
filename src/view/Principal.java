package view;


import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		int decimal = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 1000"));
		while (decimal < 0  || decimal > 1000) {
			System.out.println("Valor invalido");
			decimal = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 1000"));
		}

		ConverteController converte = new ConverteController();
		converte.decToBin(decimal);
	}

}
	
