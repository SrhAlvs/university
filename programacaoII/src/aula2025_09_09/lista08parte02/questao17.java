package aula2025_09_09.lista08parte02;

import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro positivo: ");
        int num1 = scanner.nextInt();
        int quantidade = 0;

        System.out.println("Quantidade de dígitos: " + quantidadeDigitos(num1, quantidade));

        scanner.close();
    }

    public static int quantidadeDigitos(int n, int digitos) {
        if (n == 0) {
            return 1;
        } else {
            n = n/10;
            digitos++;
            return quantidadeDigitos(n, digitos);
        }
    }
}
