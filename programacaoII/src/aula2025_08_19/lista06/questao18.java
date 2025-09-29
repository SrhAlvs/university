package aula2025_08_19.lista06;

import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num = scanner.nextInt();

        int digitos = 0;

        while (num != 0) {
            num = num/10;
            digitos++;
        }

        System.out.println("Quantidade de dígitos: " + digitos);
        scanner.close();
    }
}
