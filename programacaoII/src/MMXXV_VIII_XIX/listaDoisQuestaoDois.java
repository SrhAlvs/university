package MMXXV_VIII_XIX;

import java.util.Scanner;

public class listaDoisQuestaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Digite o raio do círculo: ");
        float raio = scanner.nextFloat();
        double areaCirculo = PI * raio * raio;

        System.out.println("A área do círculo com raio " + raio + " é de: " + areaCirculo);
    }
}
