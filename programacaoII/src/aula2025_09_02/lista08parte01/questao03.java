package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Fatorial: " + fatorial(num1));

        scanner.close();
    }

    public static int fatorial(int num) {
        int resultado = 1;
        while (num >= 1) {
            resultado = resultado * num;
            num--;
        }
        return resultado;
    }
}

