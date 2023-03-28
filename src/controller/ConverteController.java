package controller;


import br.fateczl.pilhasInt.PilhaInt;


public class ConverteController {

	public ConverteController() {
		super();
	}

	public void decToBin(int decimal) {
		PilhaInt p = new PilhaInt();

		if (decimal == 0) {
			System.out.println("Conversão:" + decimal);
		}
		while (decimal > 0) {
			int resto = decimal % 2;
			p.push(resto);
			decimal = decimal / 2;
		}
		while (p.isEmpty() == false) {
			try {
				int valor = p.pop();
				System.out.print(valor);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}