package com.dio.poo;

public class RodarClasse {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		carro1.setCor("preto");
		carro1.setModelo("Gol");
		carro1.setCapacidadeTanque(55);
		
		System.out.println(carro1.getModelo()+" "+carro1.getCor()+" "+
				carro1.getCapacidadeTanque()+" "+carro1.totalValorTanque(6.25));
		
		Carro carro2 = new Carro("cinza", "Fox", 60);
		
		System.out.println(carro2.getModelo()+" "+carro2.getCor()+" "+
				carro2.getCapacidadeTanque()+" "+carro2.totalValorTanque(6.25));
	}

}
