package aula2025_08_19.lista06;

import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro positivo: ");
        int num = scanner.nextInt();

        boolean numPrimo = true;

        if (num <= 1) {
            numPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    numPrimo = false;
                    break; //sugestão do próprio IntelliJ
                }
            }
        }

        if (numPrimo) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
        scanner.close();
    }
}
