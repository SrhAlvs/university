package aula2025_08_19.lista06;

import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira dois números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a<b) {
            while (a <= b) {
                System.out.print(a + " ");
                a++;
            }
        } else {
            while (b <= a) {
                System.out.print(a + " ");
                a--;
            }
        }

        scanner.close();
    }
}
