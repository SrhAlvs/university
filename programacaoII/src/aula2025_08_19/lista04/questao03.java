package aula2025_08_19.lista04;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira dois números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("Maior número: " + num1);
        } else if (num1 < num2) {
            System.out.println("Maior número: " + num2);
        } else {
            System.out.println("Os números são iguais.");
        }
        scanner.close();
    }
}
