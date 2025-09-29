package aula2025_09_09.lista08parte02;

import java.util.Scanner;

public class questao15imensa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num = scanner.nextInt();

        for (int i = num; i > 0; i--) {
           System.out.print(nFibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int nFibonacci (int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return nFibonacci(n - 1) + nFibonacci(n - 2);
    }
}
