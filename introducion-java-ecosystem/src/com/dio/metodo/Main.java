package com.dio.metodo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1, num2, menu;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("====== CALCULADORA ======");
		System.out.println("Insira um n�mero: ");
		num1 = scan.nextInt();
		System.out.println("Insira um n�mero: ");
		num2 = scan.nextInt();
		System.out.println("=========================");
		System.out.println("O que voc� deseja?");
		System.out.println("1-SOMA");
		System.out.println("2-SUBTRA��O");
		System.out.println("3-MULTIPLICA��O");
		System.out.println("4-DIVIS�O");
		System.out.println("5-TODAS OPERA��ES");
		System.out.println("=========================");
		System.out.println("MENU: ");
		menu = scan.nextInt();
		System.out.println("=========================");
		System.out.println("RESULTADO");
		
		switch (menu) {
		case 1: {
			Calculadora.soma(num1, num2);
			break;
		}
		case 2: {
			Calculadora.subtracao(num1, num2);
			break;
		}
		case 3: {
			Calculadora.multiplicacao(num1, num2);
			break;
		}
		case 4: {
			Calculadora.divisao(num1, num2);
			break;
		}
		case 5: {
			Calculadora.soma(num1, num2);
			Calculadora.subtracao(num1, num2);
			Calculadora.multiplicacao(num1, num2);
			Calculadora.divisao(num1, num2);
			break;
		}
		default:
			System.out.println("N�mero inv�lido!");
		}
	}

}
