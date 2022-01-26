package com.dio.heranca3;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main {

	public static void main(String[] args) {
		ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
	
	for(ClasseMae classe : classes) {
		classe.metodo1();
	}
	System.out.println();
	
	for(ClasseMae classe : classes) {
		classe.metodo2();
	}
	
	System.out.println();
	
	ClasseFilha2 classeFilha2 = new ClasseFilha2();
	classeFilha2.metodo2();
	classeFilha2.metodo1();
}
}
