package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o raio do círculo: ");
        float raio1 = scanner.nextInt();

        System.out.println("Área do círculo: " + areaCirculo(raio1));

        scanner.close();
    }

    public static double areaCirculo(float raio) {
        double PI = 3.14159265359;
        return (PI*raio*raio);
    }
}
