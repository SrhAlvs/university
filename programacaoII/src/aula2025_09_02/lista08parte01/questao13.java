package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a primeira coordenada (x y): ");
        float x1 = scanner.nextInt();
        float y1 = scanner.nextInt();

        System.out.print("Insira a segunda coordenada (x y): ");
        float x2 = scanner.nextInt();
        float y2 = scanner.nextInt();

        System.out.println("Distância entre os pontos: " + distanciaEntrePontos(x1, y1, x2, y2));

        scanner.close();
    }

    public static double distanciaEntrePontos(float a, float b, float c, float d) {
        return Math.sqrt(((c-a)*(c-a)) + ((d-b)*(d-b)));
    }
}
