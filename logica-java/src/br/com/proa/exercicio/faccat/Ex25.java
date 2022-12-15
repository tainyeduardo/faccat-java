package lista_faccat;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Oii, digite o seu saldo");
		double saldo = sc.nextDouble();
		System.out.println("Digite o débito");
		double debito = sc.nextDouble();
		System.out.println("Por fim, digite o crédito");
		double credito = sc.nextDouble();
		
		double saldoT = saldo-debito+credito;
		if (saldoT >=0) {
			System.out.println("R$"+saldoT+" • Saldo Positivo!");
		}
		else {
			System.out.println("R$"+saldoT+" • Saldo Negativo!");
		}
		
		sc.close();
	}

}
