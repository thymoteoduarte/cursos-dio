package com.dio.metodo;

import java.util.Scanner;

public class MainEmprestimo {

	public static void main(String[] args) {
		double valor;
		int parcela;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("====== CALCULO EMPRESTIMO ======");
		System.out.println("Insira um valor: ");
		valor = scan.nextDouble();
		System.out.println("Insira a quantidade de parcelas: ");
		parcela = scan.nextInt();
		System.out.println("=========================");
		System.out.println("RESULTADO");
		
		Emprestimo.calculoTaxa(valor, parcela);
	}
}
