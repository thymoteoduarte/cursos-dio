package com.dio.array;

/*
 * Faça um programa que calcula o fatorial de um número
 * inserido pelo usuário
 * **/


import java.util.Scanner;

public class Ex6Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int multiplicacao = 1;
		
		System.out.println("Fatorial: ");
		int fatorial = scan.nextInt();
		
		System.out.print(fatorial+"! = ");
		for(int i = fatorial; i >= 1; i--) {
			multiplicacao = multiplicacao*i;
		}
		System.out.println(multiplicacao);
	}

}
