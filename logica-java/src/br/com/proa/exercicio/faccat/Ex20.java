package lista_faccat;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        float valor1 = sc.nextFloat();
        System.out.println("Digite o segundo valor");
        float valor2 = sc.nextFloat();

        if(valor1 < valor2){
            System.out.println("A ordem crescente é: " +valor1 + " , " + valor2);
        }
        else{
            System.out.println("A ordem crescente é: " +valor2 + " , " + valor1);
        }

        sc.close();
    }
}
