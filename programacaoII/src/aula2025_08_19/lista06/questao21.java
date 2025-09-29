package aula2025_08_19.lista06;

// Algoritmo de Collatz

import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro positivo: ");
        int n = scanner.nextInt();
        while (n < 0) {
            System.out.print("Número inválido. Insira novamente: ");
            n = scanner.nextInt();
        }

        System.out.print(n + " ");
        while (n != 1) {
            if ((n%2) == 0) {
                n = n/2;
                System.out.print(n + " ");
            } else {
                n = 3 * n + 1;
                System.out.print(n + " ");
            }
        }

        scanner.close();
    }
}
