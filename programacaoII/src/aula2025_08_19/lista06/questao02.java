package aula2025_08_19.lista06;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int n = scanner.nextInt();
        int soma = 0;

        if (n>0) {
            for (int i = 1; i<=n; i++) {
                soma += i;
            }
            System.out.println("Soma dos números de 1 até " + n + ": " + soma);
        } else if (n==0) {
            System.out.println("Soma: 0");
        } else { //escolhi calcular tanto para n>0 quanto para n<0
            for (int i = -1; i>=n; i--) {
                soma += i;
            }
            System.out.println("Soma dos números de -1 até " + n + ": " + soma);
        }
        scanner.close();
    }
}
