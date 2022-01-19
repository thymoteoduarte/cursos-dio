package com.dio.base;

public class Order {
	
	private final String code;
	private final int totalValue;
	
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
	
	public String toString() {
		return "Order{" + "code='" +code + "'" +"," + "\n"
				+ "totalValue= " + totalValue + "}";
	}

}
