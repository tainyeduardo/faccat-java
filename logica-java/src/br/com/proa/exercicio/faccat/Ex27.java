package lista_faccat;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos checar o n�mero?");
		float num = sc.nextFloat();
		
		String resultado = (num >= 0) ? "N�mero Positivo!" : "N�mero Negativo!";
		System.out.println(resultado);
		
		sc.close();
	}

}
