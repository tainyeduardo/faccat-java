package lista_faccat;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double peso_ideal;
		
		System.out.println("Ol�! Para come�ar digite o seu nome");
		String nome = sc.next();
		System.out.println("Digite a sua altura");
		double altura = sc.nextDouble();
		System.out.println("Por �ltimo, digite o n�mero de acordo com o seu sexo");
		System.out.println("1- F \n2- M");
		int sexo = sc.nextInt();
		
		switch (sexo) {
		case 1: {
				peso_ideal = (62.1 * altura) - 44.7;	
				System.out.println(nome + ", seu peso ideal � "+ peso_ideal);
		}break;
		case 2: {
				peso_ideal = (72.7 * altura) - 58;	
				System.out.println(nome + ", seu peso ideal � "+ peso_ideal);
		}break;
		default:
			System.out.println("N�o foi poss�vel encontar o valor digitado :" + sexo);
		}
		
		sc.close();
	}

}
