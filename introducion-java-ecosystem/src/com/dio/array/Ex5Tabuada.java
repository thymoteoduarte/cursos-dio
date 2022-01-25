package com.dio.array;

import java.util.Scanner;
/*
 * Gaerador de tabuada**/

public class Ex5Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabuada: ");
		int tabuada = scan.nextInt();
		
		for(int i=0; i <=10; i++) {
			System.out.println(tabuada+" x "+i+" = "+tabuada*i);
		}
	}

}
