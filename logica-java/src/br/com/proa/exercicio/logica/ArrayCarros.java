package br.com.proa.exercicio.logica;

import java.util.Scanner;

public class ArrayCarros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] carros = new String[5];
		
		System.out.println("adicione 5 marcas de carros: ");
		for (int i = 0; i < carros.length; i++) {
			carros[i] = sc.nextLine();
		}
		
		System.out.println("_________________________________");
		
		for (int i = 0; i < carros.length; i++) {
			System.out.println(i + " - " + carros[i]);
		}
		
		sc.close();

	}

}