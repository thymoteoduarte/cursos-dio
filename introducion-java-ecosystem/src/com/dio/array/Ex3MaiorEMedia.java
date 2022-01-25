package com.dio.array;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 números e
 * informe o maior número e a média desses números
 * */

public class Ex3MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, count = 0, maior = 0;
		double soma = 0;
		
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			if(numero>maior) {
				maior = numero;
			}
			soma = soma + numero;
			count++;
		} while (count<5);
		System.out.println("Maior número: "+maior);
		System.out.println("Média dos números: "+soma/5);
	}

}
