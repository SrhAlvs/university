package aula2025_08_19.lista06;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0, soma = 0;

        while (num >= 0) {
            soma += num;
            System.out.print("Digite um número inteiro: ");
            num = scanner.nextInt();
        }

        System.out.println("O resultado é: " + soma);

        scanner.close();
    }
}
