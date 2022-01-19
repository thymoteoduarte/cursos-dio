package com.dio.base;

public class Order {
	
	private final String code;
	private final int totalValue;
	private String[] itens;
	
	public Order(String code, int totalValue) {
		this.code = code;
		this.totalValue = totalValue;
	}
	
	public int calculateFee() {
		if(this.totalValue>100) {
			return totalValue*1;
		}else {
			return totalValue;
		}
	}
	
	public int calculateFeeSwitch() {
		switch (totalValue) {
		case 100: {
			return totalValue*1;
		}
		case 200: {
			return totalValue*2;
		}
		default:
			return totalValue;
		}
	}
	
	public void printItens() {
		int contador = 0;
		while(contador<itens.length) {
			System.out.println(itens[contador]);
			contador++;
		}
	}
	
	public void printItensDoWhile() {
		int contador = 0;
		do{
			System.out.println(itens[contador]);
			contador++;
		}while(contador<itens.length);
	}
	
	public void printItensFor() {
		for(int i = 0; i < itens.length; i++)
			System.out.println(itens[i]);
	}
	
	public void printItensFor2() {
		for(String i : itens)
			System.out.println(i);
	}
	
	public String toString() {
		return "Order{" + "code='" +code + "'" +"," + "\n"
				+ "totalValue= " + totalValue + "}";
	}

}
