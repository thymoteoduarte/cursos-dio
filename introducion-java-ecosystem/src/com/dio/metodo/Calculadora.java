package com.dio.metodo;

/**
 * @author Thymoteo Duarte
 * Classe cr�ada como exerc�cio 1 da aula de m�todos
 */

public class Calculadora {
	
	public static void soma (double num1, double num2) {
		double total = num1 + num2;
		
		System.out.println(num1+" + "+num2+" = "+total);
	}
	public static void subtracao (double num1, double num2) {
		double total = num1 - num2;
		
		System.out.println(num1+" - "+num2+" = "+total);
	}
	public static void multiplicacao (double num1, double num2) {
		double total = num1 * num2;
		
		System.out.println(num1+" * "+num2+" = "+total);
	}
	public static void divisao (double num1, double num2) {
		double total = num1 / num2;
		
		System.out.println(num1+" / "+num2+" = "+total);
	}

}
