package br.com.proa.exercicio.faccat;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um numero para o sistema informar se � par ou impar:");
		int n = sc.nextInt();
		
		if (n % 2 == 0) 
			System.out.println("o numero � par!");
		
		else System.out.println("o numero � impar!");
		
		sc.close();
	}

}
