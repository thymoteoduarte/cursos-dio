package com.dio.metodo;

public class Mensagem {
	
	public static void msgHorario(int horas) {
		switch (horas) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:{
			System.out.println("Olá, bom dia!");
		}
		break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
			System.out.println("Olá, boa tarde");
			break;
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Olá, boa noite!");
			break;
		default:
			System.out.println("Horário inválido, insira um válido!");
		}
	}

}
