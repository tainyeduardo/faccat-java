package lista_faccat;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        float valor1 = sc.nextFloat();
        System.out.println("Digite o segundo valor");
        float valor2 = sc.nextFloat();

        if(valor1 > valor2){
            System.out.printf("O primeiro número %.2f , é maior que o segundo %.2f",valor1,valor2);
        }
        else{
            System.out.printf("O segundo número %.2f ,é maior que o primeiro %.2f",valor2,valor1);
        }

        sc.close();
    }
}
