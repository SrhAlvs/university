package aula2025_08_19.lista06;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resposta;

        System.out.print("Digite:\n" +
                "1. para exibir uma saudação;\n" +
                "2. para exibir a data;\n" +
                "3. para sair.\n" +
                "R.: ");
        resposta = scanner.nextInt();

        while (resposta != 3) {
            if (resposta == 1) {
                System.out.println("\nOlá!\n");
            } else if (resposta == 2) {
                System.out.println("\nData: XII-VI-MMXXV\n");
            }

            System.out.print("Digite:\n" +
                    "1. para exibir uma saudação;\n" +
                    "2. para exibir a data;\n" +
                    "3. para sair.\n" +
                    "R.: ");
            resposta = scanner.nextInt();
        }

        System.out.println("\nSaindo...\n");
        scanner.close();
    }
}
