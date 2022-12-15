package lista_faccat;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos checar o número?");
		float num = sc.nextFloat();
		
		String resultado = (num >= 0) ? "Número Positivo!" : "Número Negativo!";
		System.out.println(resultado);
		
		sc.close();
	}

}
