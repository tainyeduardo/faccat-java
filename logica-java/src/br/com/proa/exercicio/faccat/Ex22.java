package lista_faccat;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        double salario;
        double acresc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Para começarmos, quantas horas você trabalhou nesse mês?");
        float horas = sc.nextFloat();

        System.out.println("Agora, quando você recebe por hora?");
        float hValor = sc.nextFloat();

        if (horas > 40){
            acresc = (horas - 40)*0.5;
            hValor = hValor*40;
        }
        else{
            acresc = 0;
            hValor = hValor * horas;
        }

        salario = hValor + acresc;

        System.out.println("O seu salário final será no total de R$"+salario);
        sc.close();
    }
}
