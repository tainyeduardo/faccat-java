package br.com.proa.exercicio.faccat;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para calcular o valor final do carro, primeiro insira: ");
		System.out.println("O custo de f�brica do ve�culo: ");
		double precofabrica = sc.nextDouble();
		
		double valord = precofabrica*28/100;
		double valori = precofabrica*45/100;
		double valorfinal = precofabrica+valord+valori;
		
		System.out.printf("O valor final do ve�culo �: R$ %.2f",valorfinal);
		
		sc.close();

	}

}
