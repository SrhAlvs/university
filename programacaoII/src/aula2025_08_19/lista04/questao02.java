package aula2025_08_19.lista04;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
        scanner.close();
    }
}
