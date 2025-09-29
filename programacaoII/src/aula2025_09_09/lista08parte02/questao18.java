package aula2025_09_09.lista08parte02;

import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor da base: ");
        int b = scanner.nextInt();
        System.out.print("Insira o valor do expoente: ");
        int e = scanner.nextInt();

        int r = 1;

        System.out.println("Resultado: " + potenciacao(b, e, r));

        scanner.close();
    }

    public static int potenciacao(int base, int expoente, int resultado) {
        if (expoente == 1) {
            return resultado * base;
        } else {
            resultado += resultado * base;
            expoente--;
            return potenciacao(base, expoente, resultado);
        }
    }
}
