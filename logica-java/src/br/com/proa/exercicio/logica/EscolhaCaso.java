package br.com.proa.exercicio.logica;

import java.util.Scanner;

public class EscolhaCaso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o numero de um dia da semana: ");
		int numero = sc.nextInt();
		
		switch(numero) {
		
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda");
			break;
		case 3:
			System.out.println("terça");
			break;
		case 4:
			System.out.println("quarta");
			break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		case 7:
			System.out.println("sabado");
			break;
		}
		
		if (numero > 7 || numero < 1) {
			System.out.println("nao existe dia da semana correspondente para esse numero");
		}
		
		sc.close();

	}

}
