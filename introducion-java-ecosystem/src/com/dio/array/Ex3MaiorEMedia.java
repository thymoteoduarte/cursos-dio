package com.dio.array;

import java.util.Scanner;

/*
 * Fa�a um programa que leia 5 n�meros e
 * informe o maior n�mero e a m�dia desses n�meros
 * */

public class Ex3MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, count = 0, maior = 0;
		double soma = 0;
		
		do {
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			if(numero>maior) {
				maior = numero;
			}
			soma = soma + numero;
			count++;
		} while (count<5);
		System.out.println("Maior n�mero: "+maior);
		System.out.println("M�dia dos n�meros: "+soma/5);
	}

}
