package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira dois números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Maior: " + maior(num1, num2));

        scanner.close();
    }

    public static int maior(int a, int b) {
        if (a > b) { return a; }
        else { return b; }
    }
}
