package com.dio.metodo;

public class CalcularArea {
	public static void areaQuadrilatero(int lado) {
		System.out.println("�rea do quadrado: "+lado*lado);
	}
	public static void areaQuadrilatero(int lado1, int lado2) {
		System.out.println("�rea do ret�ngulo: "+lado1*lado2);
	}
	public static void areaQuadrilatero(int baseMaior, int baseMenor, int altura) {
		System.out.println("�rea do trap�zio: "+((baseMaior+baseMenor)*altura)/2);
	}
	
}
