package aula2025_08_19.lista06;

// Sequência de Fibonacci (limitada)

import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num = scanner.nextInt();

        int soma=0, aux1=0, aux2=1;

        System.out.print(aux1 + " ");
        while (soma <= num) {
            System.out.print(aux2 + " ");
            soma = aux1 + aux2;
            aux1 = aux2;
            aux2 = soma;
        }

        scanner.close();
    }
}
