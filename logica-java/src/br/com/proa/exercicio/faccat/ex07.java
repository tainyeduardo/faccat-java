package br.com.proa.exercicio.faccat;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para exibir sua idade em apenas dias, ser� necess�rio que voc� insira sua idade em anos, meses e dias primeiro");
		System.out.println("Quantos anos de vida voc� t�m?");
		int ano = sc.nextInt();
		System.out.println("quantos meses?");
		int mes = sc.nextInt();
		System.out.println("Agora, quantos dias?");
		int dia = sc.nextInt();
		
		int contaano = ano*365;
		int contames = mes*30;
		int contafinal = contaano+contames+dia;
		
		System.out.println("A sua idade expressa em apenas dias � igual �: "+contafinal+" dias");
		
		sc.close();
	}

}
