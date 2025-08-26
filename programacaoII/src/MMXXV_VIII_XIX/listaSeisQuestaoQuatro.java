package MMXXV_VIII_XIX;

import java.util.Scanner;

public class listaSeisQuestaoQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float soma = 0;

        for (int i = 1; i<=5; i++) {
            System.out.print("Insira o " + i + "º número: ");
            int num = scanner.nextInt();
            soma += num;
        }
        soma = soma/5;

        System.out.println("Média: " + soma);
    }
}
