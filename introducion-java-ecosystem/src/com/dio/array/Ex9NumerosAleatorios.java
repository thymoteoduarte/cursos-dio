package com.dio.array;

/*
 * Fa�a um programa que leia 20 n�meros aleat�rios (entre 0 e 100)
 * e armazene-os num vetor. Imprima-os, mostrando tamb�m o seus
 * antecessores e sucessores.
 * **/

import java.util.Random;

public class Ex9NumerosAleatorios {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numerosAleatorios = new int [20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("N�meros aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\nN�meros antecessores: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero-1 + " ");
		}
		
		System.out.println("\nN�meros sucessores: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero+1 + " ");
		}
		
	}

}
