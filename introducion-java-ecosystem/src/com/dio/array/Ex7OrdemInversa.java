package com.dio.array;

/**
 * Crie um vetor de 6 números inteiros 
 * e mostre na ordem inversa.*/

public class Ex7OrdemInversa {

	public static void main(String[] args) {
		
		int [] vetor = {0, -5, 3, 2, 5, 88};
		
		for(int i = vetor.length-1; i >=0; i--) {
			System.out.print(vetor[i]+" ");
		}
	}

}
