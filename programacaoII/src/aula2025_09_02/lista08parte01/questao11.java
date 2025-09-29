package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Resultado: " + aoQuadrado(num1));

        scanner.close();
    }

    public static int aoQuadrado(int num) {
        return num*num;
    }
}
