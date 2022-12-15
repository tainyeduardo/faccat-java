package br.com.proa.exercicio.logica;

import java.util.Scanner;

public class temporizador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira os minutos do temporizador: ");
		int min = sc.nextInt();
		
		for(int i = min; i >= 0; i--) {
			for(int s = 59; s >= 0; s--) {
				System.out.println(i + ":" + s);
			}
		}

		
		sc.close();
	}

}
