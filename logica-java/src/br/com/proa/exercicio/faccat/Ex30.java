package lista_faccat;

import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String resposta = "";
		
		System.out.println("Digite o primeiro valor");
		float a = sc.nextFloat();
		System.out.println("Digite o segundo valor");
		float b = sc.nextFloat();
		System.out.println("Agora por fim, o terceiro valor");
		float c = sc.nextFloat();
		
		if(a<b && a<c) {
			if(b<c) {
				resposta = "A sequ�ncia �: "+a+", "+b+", "+c;
			}
			else {
				resposta = "A sequ�ncia �: "+a+", "+c+", "+b;
			}
		}
		if(b<a && b<c) {
			if(a<c) {
				resposta = "A sequ�ncia �: "+b+", "+a+", "+c;
			}
			else {
				resposta = "A sequ�ncia �: "+b+", "+c+", "+a;
			}
		}
		if(c<a && c<b) {
			if(a<b) {
				resposta = "A sequ�ncia �: "+c+", "+a+", "+b;
			}
			else {
				resposta = "A sequ�ncia �: "+c+", "+b+", "+a;
			}
		}
		
		System.out.println(resposta);
		sc.close();
		
	}

}
