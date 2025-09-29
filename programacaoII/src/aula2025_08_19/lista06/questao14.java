package aula2025_08_19.lista06;

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;

        System.out.print("Insira um valor: ");
        int num = scanner.nextInt();

        while (num != 0) {
            quantidade++;
            soma += num;
            System.out.print("Insira um valor: ");
            num = scanner.nextInt();
        }

        double media = (double) soma /quantidade;
        System.out.println("Média: " + media);

        scanner.close();
    }
}
