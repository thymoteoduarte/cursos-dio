package com.dio.metodo;

import java.util.Scanner;

public class MainMensagem {
	public static void main(String[] args) {
		int horas;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========== REL�GIO ==========");
		System.out.println("Insira o hor�rio atual: ");
		horas = scan.nextInt();
		System.out.println("========== MENSAGEM ==========");
		Mensagem.msgHorario(horas);
		
	}

}
