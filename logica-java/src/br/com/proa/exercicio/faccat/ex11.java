package br.com.proa.exercicio.faccat;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para calcular o sal�rio final do vendedor + suas comiss�es totais, primeiro insira: ");
		System.out.println("O sal�rio fixo do vendedor: ");
		double salariofixo = sc.nextDouble();
		
		System.out.println("Quantos carros o vendedor vendeu no m�s? ");
		int qtdvendas = sc.nextInt();
		
		System.out.println("Qual foi o valor total das vendas do vendedor? ");
		double valorvendas = sc.nextDouble();
		
		System.out.println("Qual � o valor da comiss�o individual por cada carro vendido?");
		double comissao = sc.nextDouble();
		
		double contacomissao = comissao*qtdvendas;
		double contaacrescimo = valorvendas*5/100;
		double salariofinal = salariofixo + contacomissao + contaacrescimo;
		
		System.out.printf("O sal�rio final do vendedor � R$ %.2f",salariofinal);
		
		sc.close();

	}

}
