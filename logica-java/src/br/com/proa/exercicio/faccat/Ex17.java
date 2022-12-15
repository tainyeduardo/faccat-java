package lista_faccat;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a sua segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1+nota2)/2;

        if(media >=6){
            System.out.println("O aluno foi aprovado com média final de " +media);
        }
        else{
            System.out.println("O aluno foi reprovado com média final de "+media);
        }
        sc.close();
    }
}
