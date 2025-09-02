package aula2025_08_19.lista03;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira uma temperatura em Celcius (ºC): ");
        float temperatura = scanner.nextFloat();
        double conversaoCParaF = temperatura * 1.8 + 32;
        System.out.println("A temperatura " + temperatura + "ºC corresponde a " + conversaoCParaF + "F.");
        scanner.close();
    }
}
