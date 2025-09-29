package aula2025_08_19.lista03;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Insira o raio do círculo: ");
        float raio = scanner.nextFloat();
        double areaCirculo = PI * raio * raio;

        System.out.println("Área do círculo: " + areaCirculo);
        scanner.close();
    }
}
