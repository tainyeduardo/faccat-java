package lista_faccat;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a sua segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a sua terceita nota: ");
        double nota3 = sc.nextDouble();

        double resultado = ((nota1*2)+(nota2*3)+(nota3*5))/10;

        System.out.println("Sua média final é: "+resultado);

        sc.close();
    }
}
