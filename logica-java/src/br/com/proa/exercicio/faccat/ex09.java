package br.com.proa.exercicio.faccat;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para calcular seu novo salário, primeiro insira: ");
		System.out.println("O seu salário atual: ");
		double salario = sc.nextDouble();
		
		System.out.println("Agora, insira o percentual de reajuste: ");
		double reajuste = sc.nextDouble();
		
		double conta = salario*reajuste/100;
		double salariofinal = conta+salario;
		
		System.out.printf("O seu salário após o reajuste será de R$ %.2f",salariofinal);
		
		sc.close();

	}

}
