package aula2025_09_09.lista08parte02;

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Fatorial de " + num1 + ": " + fatorial(num1));

        scanner.close();
    }

    public static int fatorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * fatorial(num - 1);
        }
    }
}
