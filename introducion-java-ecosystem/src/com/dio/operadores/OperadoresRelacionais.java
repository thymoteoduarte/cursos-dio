package com.dio.operadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		int i1=10, i2=20;
		float f1=4.5f, f2=3.5f;
		char c1='x', c2='y';
		String s1 = "Fulano", s2 = "Fulano";
		boolean b1 = true, b2 = false;
		
		System.out.println("i1 "+i1+" i2 "+i2);
		System.out.println("i1==i2: "+i1+"=="+i2+" "+(i1==i2));
		System.out.println("i1!=i2: "+(i1!=i2));
		System.out.println("i1>i2: "+(i1>i2));
		System.out.println("i1<=i2: "+(i1<=i2));

		System.out.println("\nf1 "+f1+" f2 "+f2);
		System.out.println("f1==f2: "+(f1==f2));
		System.out.println("f1!=f2: "+(f1!=f2));
		System.out.println("f1>=f2: "+(f1>=f2));
		System.out.println("f1<f2: "+(f1<f2));
		
		System.out.println("\nc1 "+c1+" c2 "+c2);
		System.out.println("c1==c2: "+(c1==c2));
		System.out.println("c1!=c2: "+(c1!=c2));
		System.out.println("c1>c2: "+(c1>c2));
		System.out.println("c1<=c2: "+(c1<=c2));
		
		System.out.println("\ns1 "+s1+" s2 "+s2);
		System.out.println("s1==s2: "+(s1==s2));
		System.out.println("s1!=s2: "+(s1!=s2));
		//System.out.println("s1>=s2: "+(s1>=s2));
		//System.out.println("s1<s2: "+(s1<s2));
		
		System.out.println("\nb1 "+b1+" b2 "+b2);
		System.out.println("b1==b2: "+(b1==b2));
		System.out.println("b1!=b2: "+(b1!=b2));
		//System.out.println("b1>b2: "+(b1>b2));
		//System.out.println("b1<=b2: "+(b1<=b2));
		
		System.out.println("\ni2 "+i2+" f1 "+f1);
		System.out.println("i2>f1: "+(i2>f1));
	}

}
