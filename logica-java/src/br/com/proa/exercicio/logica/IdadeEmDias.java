package br.com.proa.exercicio.logica;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para expressar sua idade em apenas dias, primeiro é necessário inserir sua idade em anos, meses e dias.");
		System.out.println("Primeiro os anos de sua idade: ");
		int anos = sc.nextInt();
		System.out.println("Agora, os meses de sua idade: ");
		int meses = sc.nextInt();
		System.out.println("Por fim, os dias da sua idade: ");
		int dias = sc.nextInt();
		
		anos = anos * 365;
		meses = meses * 30;
		dias = anos + meses + dias;
		
		System.out.println("Sua idade expressa em apenas dias é: " +dias+ " dias.");
		
		sc.close();

	}

}
