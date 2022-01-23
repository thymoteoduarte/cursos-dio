package com.dio.metodo;

/**
 * @author Thymoteo Duarte
 * Classe críada como exercício 1 da aula de métodos
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
