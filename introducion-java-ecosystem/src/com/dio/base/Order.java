package com.dio.base;
/**
 * @author Thymoteo Duarte
 * @version 1.0.0
 * @since Release 1.0.0
 */

public class Order {
	
	// esse comentário de linha	para informar que esse atributos representam as caracteristicas dos itens
	private final String code;
	private final int totalValue;
	private String[] itens;
	
	/**
	 * Construtor de classe
	 * 
	 * @param code 			Código do pedido
	 * @param totalValue 	Valor total do pedido
	 */
	public Order(String code, int totalValue) {
		this.code = code;
		this.totalValue = totalValue;
	}
	
	/**
	 * Calcula o valor total de acordo com o valor do pedido. Se o valor for maior que 100,00 uma 
	 * taxa será cobrada.
	 *  
	 * @return Valor total do pedido com as taxas
	 */
	public int calculateFee() {
		if(this.totalValue>100) {
			return totalValue*2;
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
