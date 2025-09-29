package aula2025_09_09.lista08parte02;

import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma frase: ");
        String frase = scanner.nextLine();

        System.out.println(fraseInvertida(frase));

        scanner.close();
    }

    public static String fraseInvertida(String frase) {
        if (frase == null || frase.length() <= 1) {
            return frase;
        }
        return frase.charAt(frase.length()-1) + fraseInvertida(frase.substring(0, frase.length()-1));
            // .charAt(frase.length()-1) pega o último caractere
            // .substring(0, frase.length()-1 retorna o restante da frase sem o último caractere
    }
}
