package br.com.proa.exercicio.logica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eleicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Para calcular a porcentagem de votos válidos, brancos e nulos, primeiro insira: ");
		System.out.println("Insira a quantidade de votos válidos: ");
		float validos = sc.nextFloat();
		System.out.println("Agora, insira a quantidade de votos nulos: ");
		float nulos = sc.nextFloat();
		System.out.println("Por ultimo, insira a quantidade de votos brancos: ");
		float brancos = sc.nextFloat();
		float total;
		
		total = brancos + nulos + validos;
		validos = validos*100/total;
		brancos = brancos*100/total;
		nulos = brancos*100/total;
		
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		System.out.println("A porcentagem de votos foi: ");
		System.out.println("Votos totais: "+total+ " votos");
		System.out.println("porcentagem votos validos: "+fmt.format(validos)+"%");
		System.out.println("porcentagem votos brancos: "+fmt.format(brancos)+"%");
		System.out.println("porcentagem votos nulos: "+fmt.format(nulos)+"%");
		
		sc.close();
	}

}
