package com.dio.array;

import java.util.Iterator;
import java.util.Random;

/*
 * Gere uma matriz M 4x4 com valores aleatórios de 0 a 9.
 * **/

public class Ex10ArrayMultidimensional {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] M = new int[4][4];
		
		for (int i = 0; i < M.length; i++) {
			for(int j = 0; j < M.length; j++) {
				int numero = random.nextInt(9);
				M[i][j] = numero;
			}
		}
		
		System.out.println("MATRIZ");
		for (int[] linha : M) {
			for(int coluna : linha) {
				System.out.print("[ "+coluna+" ]");
			}
			System.out.println("");
		}
	}

}
