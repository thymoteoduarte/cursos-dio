package com.dio.metodo;

public class CalcularArea {
	public static void areaQuadrilatero(int lado) {
		System.out.println("Área do quadrado: "+lado*lado);
	}
	public static void areaQuadrilatero(int lado1, int lado2) {
		System.out.println("Área do retângulo: "+lado1*lado2);
	}
	public static void areaQuadrilatero(int baseMaior, int baseMenor, int altura) {
		System.out.println("Área do trapézio: "+((baseMaior+baseMenor)*altura)/2);
	}
	public static void areaQuadrilatero(float lado1, float lado2) {
		System.out.println("Área do losango: "+(lado1*lado2)/2);
	}
	
}
