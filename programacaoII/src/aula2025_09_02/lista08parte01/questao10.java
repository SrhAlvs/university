package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma frase ou palavra: ");
        String abc = scanner.nextLine();

        System.out.println("Frase ou palavra invertida: " + inverteString(abc));

        scanner.close();
    }

    public static String inverteString(String frase) {
        String invertido = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            invertido = invertido + frase.charAt(i);
        }

        return invertido;
    }
}
