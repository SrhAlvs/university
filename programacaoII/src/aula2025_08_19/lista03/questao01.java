package aula2025_08_19.lista03;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira 2 números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.println(soma);
        scanner.close();
    }
}
