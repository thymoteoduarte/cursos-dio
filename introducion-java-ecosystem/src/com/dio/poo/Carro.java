package com.dio.poo;

public class Carro {
	
	String cor, modelo;
	double capacidadeTanque;
	
	Carro(){
		
	}
	
	Carro(String cor, String modelo, double capacidadeTanque){
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	public double totalValorTanque(double valorCombustivel) {
		return capacidadeTanque*valorCombustivel;
	}

}
