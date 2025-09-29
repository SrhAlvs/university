package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma temperatura em Celcius (ºC): ");
        float temp = scanner.nextInt();

        System.out.println("Temperatura em Fahrenheit (F): " + conversorTemp(temp));

        scanner.close();
    }

    public static double conversorTemp(float temperatura) {
        double fahrenheit = ((temperatura * 1.8) + 32);
        return fahrenheit;
    }
}
