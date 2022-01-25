package com.dio.array;

import java.util.Scanner;
/**
 * Receber nome e idade diretamente do teclado até que seja inserido 0 no nome*/

public class ExNomeIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while(true) {
			System.out.println("Nome: ");
			nome = scan.next();
			if(nome.equals("0"))break;
			
			System.out.println("Idade: ");
			idade = scan.nextInt();
		}

	}

}
