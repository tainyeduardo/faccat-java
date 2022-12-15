package lista_faccat;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double acresc = 0d;
		double salarioT;
		System.out.println("Oii, digite o seu salário fixo");
		double salarioF = sc.nextDouble();
		System.out.println("Agora, digite o valor total de suas vendas");
		double vendas = sc.nextDouble();
		
		if(vendas <= 1500) {
			acresc = vendas * 0.03;
		}
		else if(vendas > 1500) {
			acresc = vendas * 0.05;
		}
		
		salarioT = salarioF + acresc;
		
		System.out.println("O seu salário final será no total de R$" + salarioT);
		
		sc.close();
	}

}
