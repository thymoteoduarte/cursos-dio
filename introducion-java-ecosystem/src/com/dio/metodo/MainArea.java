package com.dio.metodo;

import java.util.Scanner;

public class MainArea {
	public static void main(String[] args) {
		int num1, num2, altura, opcao;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("======= CALCULO DE ÁREA QUADRILÁTERAS ======");
		System.out.println("Qual formato você deseja calcular?");
		System.out.println("1-Quadrado");
		System.out.println("2-Retângulo");
		System.out.println("3-Trapézio");
		System.out.println("OPÇÃO: ");
		opcao = scan.nextInt();
		System.out.println("=============================================");
		
		switch (opcao) {
		case 1: {
			System.out.println("Tamanho do lado: ");
			num1 = scan.nextInt();
			CalcularArea.areaQuadrilatero(num1);
			break;
		}
		case 2: {
			System.out.println("Tamanho da base: ");
			num1 = scan.nextInt();
			System.out.println("Tamanho da altura: ");
			num2 = scan.nextInt();
			CalcularArea.areaQuadrilatero(num1, num2);
			break;
		}
		case 3: {
			System.out.println("Tamanho da base menor: ");
			num1 = scan.nextInt();
			System.out.println("Tamanho da base maior: ");
			num2 = scan.nextInt();
			System.out.println("Tamanho da altura: ");
			altura = scan.nextInt();
			CalcularArea.areaQuadrilatero(num1, num2, altura);
			break;
		}
		default:
			System.out.println("Número inválido!");
		}
	}
	
}
