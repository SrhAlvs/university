package MMXXV_VIII_XIX;

import java.util.Scanner;

public class listaSeisQuestaoTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num*i);
        }
    }
}
