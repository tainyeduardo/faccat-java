package br.com.proa.exercicio.faccat;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double conta;
		
		System.out.println("Para calcular a área do triangulo, primeiro insira: ");
		System.out.println("a base do retângulo: ");
		double base = sc.nextDouble();
		System.out.println("Agora, insira sua altura: ");
		double altura = sc.nextDouble();
		
		conta = base*altura;
		
		System.out.println("A área do retângulo é igual á: "+conta+" m²");
		
		sc.close();

	}

}
