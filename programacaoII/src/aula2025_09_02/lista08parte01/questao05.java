package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num1 = scanner.nextInt();

        if (primo(num1)) {
            System.out.println(num1 + " é um número primo.");
        } else {
            System.out.println(num1 + " não é um número primo.");
        }

        scanner.close();
    }

    public static boolean primo(int num) {
        if (num <= 1) { return false; }

        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) { return false; }
        }

        return true;
    }
}
