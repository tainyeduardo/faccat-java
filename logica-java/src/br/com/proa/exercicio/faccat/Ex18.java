package lista_faccat;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano atual");
        int ano = sc.nextInt();
        System.out.println("Digite o seu ano de nascimento");
        int nasc = sc.nextInt();

        int idade = ano - nasc;

        if(idade >= 16){
            System.out.println("Você já pode votar, pois possue "+idade+" anos");
        }
        else{
            System.out.println("Sinto muito, como voce tem "+idade+" você ainda não possui idade suficiente para votar!");
        }
        sc.close();
    }
}
