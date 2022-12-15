package br.com.proa.exercicio.logica;

import java.util.Scanner;

public class ArrayNomes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] pessoas = new String[10];
		
		System.out.println("Adicione 10 nomes de pessoas: ");
		for (int i = 0; i < pessoas.length; i++){
		pessoas[i] = sc.nextLine();
		}
		
		System.out.println("--------------------------");
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println(i + " - " + pessoas[i]);
		}
		
		sc.close();

	}

}
