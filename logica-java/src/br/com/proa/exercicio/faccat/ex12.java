package br.com.proa.exercicio.faccat;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para converter a temperatura de Fahrenheit em Celsius, primeiro insira: ");
		System.out.println("A temperatura em Fahrenheit: ");
		double f = sc.nextDouble();
		
		double contaf = (f - 32)/1.8;
		
		System.out.printf("A conversão em celsius é igual a: %.2f °",contaf);
		
		
		sc.close();
		

	}

}
