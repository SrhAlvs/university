package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num1 = scanner.nextInt();

        if (ehPar(num1)) {
            System.out.println(num1 + " é um número par.");
        } else {
            System.out.println(num1 + " não é um número par.");
        }

        scanner.close();
    }

    public static boolean ehPar(int num){
        if ((num%2) != 0) {
            return false;
        } else {
            return true;
        }
    }
}
