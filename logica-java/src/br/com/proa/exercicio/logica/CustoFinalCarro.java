package br.com.proa.exercicio.logica;

import java.util.Scanner;

public class CustoFinalCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Para calcular o valor final de um carro, deve-se considerar o custo de f�brica, impostos e taxa do vendedor");
		System.out.println("Primeiro, insira o valor de f�brica do ve�culo: ");
		double fabrica = sc.nextDouble();
		
		fabrica = fabrica + (fabrica * 0.45) + (fabrica * 0.28);
		System.out.println("O valor final do ve�culo �: R$"+fabrica);
		
		sc.close();
	}

}
