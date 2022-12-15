package lista_faccat;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        int duracao;

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Que horas começou o jogo de xadrez? (formato 24h)");
        int hInicio = sc.nextInt();

        System.out.println("E qual foi o horário que terminou o jogo?");
        int hFim = sc.nextInt();

        if(hFim > hInicio){
            duracao = hFim-hInicio;
        }
        else if(hFim < hInicio){
            duracao = 24 - (hInicio-hFim);
        }
        else{
            duracao = 24;
        }

        System.out.println("A duração total do jogo foi de "+duracao+ "h");

        sc.close();
    }
}
