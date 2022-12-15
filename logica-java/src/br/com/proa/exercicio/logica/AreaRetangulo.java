package br.com.proa.exercicio.logica;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("para calcular a area do retângulo, primeiro insira:");
		System.out.println("A base do retangulo: ");
		float base = sc.nextFloat();
		System.out.println("Agora insira a altura: ");
		float altura = sc.nextFloat();
		System.out.println("A area do retangulo é: "+ (base*altura));
		
		sc.close();
	}

}
