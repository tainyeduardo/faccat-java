package lista_faccat;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Para começarmos a calcular seu estoque, "
				+ "\ndigite a quantidade máxima do mesmo.");
		double qtdM = sc.nextDouble();
		System.out.println("Agora, digite a quantidade mínima do seu estoque.");
		double qtdm = sc.nextDouble();
		System.out.println("Por fim, digite a quantidade atual do seu estoque.");
		double qtdA = sc.nextDouble();
		
		double media = (qtdM+qtdm)/2;
		
		System.out.println("A quantidade média do seu estoque é de "+media);
		if(media >= qtdA) {
			System.out.println("Você não poderá mais efetuar compra.");
		}
		else {
			System.out.println("Seu estoque ainda não atingiu o limite, efetuar compra.");
		}
		
		sc.close();
	}

}
