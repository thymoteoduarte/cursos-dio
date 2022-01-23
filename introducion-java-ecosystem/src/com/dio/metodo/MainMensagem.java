package com.dio.metodo;

import java.util.Scanner;

public class MainMensagem {
	public static void main(String[] args) {
		int horas;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========== RELÓGIO ==========");
		System.out.println("Insira o horário atual: ");
		horas = scan.nextInt();
		System.out.println("========== MENSAGEM ==========");
		Mensagem.msgHorario(horas);
		
	}

}
