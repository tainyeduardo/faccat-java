package br.com.proa.exercicio.faccat;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um numero para o sistema informar se é par ou impar:");
		int n = sc.nextInt();
		
		if (n % 2 == 0) 
			System.out.println("o numero é par!");
		
		else System.out.println("o numero é impar!");
		
		sc.close();
	}

}
