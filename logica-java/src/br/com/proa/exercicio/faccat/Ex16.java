package lista_faccat;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade das maçãs que você irá comprar: ");
        int quantidade = sc.nextInt();

        if(quantidade < 12){
            System.out.println("O valor que você pagará é: R$" + quantidade*1.30);
        }
        else if(quantidade >=12){
            System.out.println("O valor que você pagará é: R$" + quantidade);
        }

        sc.close();
    }
}
