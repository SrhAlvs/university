package aula2025_08_19.lista06;

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor inteiro positivo: ");
        int num = scanner.nextInt();

        for (int i = num; i>=0; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}
