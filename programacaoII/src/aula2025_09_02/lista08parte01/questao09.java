package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a base e a altura do retângulo: ");
        float b = scanner.nextInt();
        float h = scanner.nextInt();

        System.out.println("Resultado: " + areaRetangulo(b,h));

        scanner.close();
    }

    public static double areaRetangulo(float base, float altura) {
        return base*altura;
    }
}
