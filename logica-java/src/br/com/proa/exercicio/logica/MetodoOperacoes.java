package br.com.proa.exercicio.logica;

public class MetodoOperacoes {


	public static void soma() {
		int a = 10;
		int b = 25;
		int contasoma = a+b;
		
		System.out.println("o resultado da soma �: "+contasoma);
		}
	
	public static void subtracao() {
		int a = 10;
		int b = 99;
		int contasub = a-b;
		
		System.out.println("O resultado da subta��o �: "+contasub);
		}
	
	public static void multiplicacao() {
		int a = 5;
		int b = 2;
		int contamulti = a*b;
		
		System.out.println("O resultado da multiplica��o �: "+contamulti);
	}
	
	public static void divisao() {
		double a = 100;
		double b = 50;
		double contadiv = a/b;
		
		System.out.println("O resultado da divis�o �: "+contadiv);
	}
	
	public static void main (String[]args) {
		soma();
		subtracao();
		multiplicacao();
		divisao();
		}
	}
