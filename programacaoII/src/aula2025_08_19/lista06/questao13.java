package aula2025_08_19.lista06;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro positivo: ");
        int num = scanner.nextInt();

        int soma = 0;
        int aux = num;

        while (aux > 0) {
            int digito = aux%10;

            soma += digito;

            aux = aux/10;
        }

        System.out.println("A soma é: " + soma);
        scanner.close();
    }
}
