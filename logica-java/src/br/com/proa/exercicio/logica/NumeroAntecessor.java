
package br.com.proa.exercicio.logica;

import java.util.Scanner;

public class NumeroAntecessor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite um n�mero inteiro para exibit seu antecessor: ");
		
		int numero = sc.nextInt();
		System.out.println("O numero antecessor do digitado � " + (numero-1));
		
		sc.close();
	}

}
