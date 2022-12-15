package br.com.proa.exercicio.logica;

public class MetodoParametro {

	static void myMethod(String nome) {
		System.out.println(nome + " Souza");
	}
	
	public static void main(String[]args) {
		myMethod("Tainy");
		myMethod("Nathan");
		myMethod("Marcelo");
		myMethod("Hartur");
	}
}
