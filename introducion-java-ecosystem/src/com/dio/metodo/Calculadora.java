package com.dio.metodo;

public class Calculadora {
	
	public static void soma (int num1, int num2) {
		double total = num1 + num2;
		
		System.out.println(num1+" + "+num2+" = "+total);
	}
	public static void subtracao (int num1, int num2) {
		double total = num1 - num2;
		
		System.out.println(num1+" - "+num2+" = "+total);
	}
	public static void multiplicacao (int num1, int num2) {
		double total = num1 * num2;
		
		System.out.println(num1+" * "+num2+" = "+total);
	}
	public static void divisao (int num1, int num2) {
		double total = num1 / num2;
		
		System.out.println(num1+" / "+num2+" = "+total);
	}

}
