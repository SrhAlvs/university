package aula2025_08_19.lista06;

import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i < num; i++) {
            if ((num%i) == 0) {
                soma += i;
            }
        }

        if (soma == num) {
            System.out.println(num + " é um número perfeito.");
        } else {
            System.out.println(num + " não é um número perfeito.");
        }

        scanner.close();
    }
}
