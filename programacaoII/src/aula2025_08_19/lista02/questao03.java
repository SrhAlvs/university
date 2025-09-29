package aula2025_08_19.lista02;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dada a equação: a + b * c / d - e");

        System.out.print("Insira o valor de 'a': ");
        float a =  scanner.nextFloat();

        System.out.print("Insira o valor de 'b': ");
        float b =  scanner.nextFloat();

        System.out.print("Insira o valor de 'c': ");
        float c =  scanner.nextFloat();

        System.out.print("Insira o valor de 'd': ");
        float d =  scanner.nextFloat();

        System.out.print("Insira o valor de 'e': ");
        float e =  scanner.nextFloat();

        float equacao = a + b * c / d - e;
        System.out.println("Respeitando a precedência, o resultado da equação é: " + equacao);

        float equacaoPrecedenciaAlterada = (a + b) * c / (d - e);
        System.out.println("Mudando a precedência para (a + b) * c / (d - e), o resultado se torna: " + equacaoPrecedenciaAlterada);
        scanner.close();
    }
}
