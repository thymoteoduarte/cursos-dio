package com.dio.array;

import java.util.Scanner;

/**
 * Fa�a um programa que pe�a uma nota, entre 0 e 10.
 * Mostre uma mensagem caso o valor seja inv�lido
 * e continue pedindo at� que o usu�rio forne�a
 * um valor v�lido*/

public class Ex2Nota {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = scan.nextInt();
		
		while (nota <0 | nota>10) {
			System.out.println("Nota inv�lida! Insira novamente: ");
			nota = scan.nextInt();
		}

	}

}
