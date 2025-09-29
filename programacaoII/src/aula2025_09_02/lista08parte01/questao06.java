package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira três números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("Resultado: " + media(num1, num2, num3));

        scanner.close();
    }

    public static double media(float a, float b, float c) {
        return (a+b+c)/3;
    }
}
