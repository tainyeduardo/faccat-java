package br.com.proa.exercicio.faccat;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para calcular o salário final do vendedor + suas comissões totais, primeiro insira: ");
		System.out.println("O salário fixo do vendedor: ");
		double salariofixo = sc.nextDouble();
		
		System.out.println("Quantos carros o vendedor vendeu no mês? ");
		int qtdvendas = sc.nextInt();
		
		System.out.println("Qual foi o valor total das vendas do vendedor? ");
		double valorvendas = sc.nextDouble();
		
		System.out.println("Qual é o valor da comissão individual por cada carro vendido?");
		double comissao = sc.nextDouble();
		
		double contacomissao = comissao*qtdvendas;
		double contaacrescimo = valorvendas*5/100;
		double salariofinal = salariofixo + contacomissao + contaacrescimo;
		
		System.out.printf("O salário final do vendedor é R$ %.2f",salariofinal);
		
		sc.close();

	}

}
