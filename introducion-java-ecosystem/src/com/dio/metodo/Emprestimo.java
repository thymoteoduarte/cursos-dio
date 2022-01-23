package com.dio.metodo;

public class Emprestimo {
	
	public static double getTaxaUmaParcela() {
		return 0.1;
	}
	public static double getTaxaDuasParcelas() {
		return 0.3;
	}
	public static double getTaxaTresParcelas() {
		return 0.5;
	}
	
	public static void calculoTaxa(double valor, int parcela) {
		if(parcela == 1) {
			System.out.println("Valor atual é: "+(valor+valor*getTaxaUmaParcela()));
		}
		else if(parcela == 2) {
			System.out.println("Valor atual é: "+(valor+valor*getTaxaDuasParcelas()));
		}
		else if(parcela == 3) {
			System.out.println("Valor atual é: "+(valor+valor*getTaxaTresParcelas()));
		}
		else {
			System.out.println("Valor de empréstimo não disponível para este parcelamente!");
		}
		
	}

}
