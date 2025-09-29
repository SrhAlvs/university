package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira dois números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Resultado: " + somar(num1, num2));

        scanner.close();
    }

    public static int somar(int a, int b) {
        return a+b;
    }
}
