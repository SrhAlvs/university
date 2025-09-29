package aula2025_09_09.lista08parte02;

import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma frase: ");
        String palavra = scanner.nextLine();

        String invertido = palavra.replaceAll("\\s+", "").toLowerCase();

        if (palindromo(invertido)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean palindromo(String plvr) {
        if (plvr.length() <= 1) {
            return true;
        }

        if (plvr.charAt(0) != plvr.charAt(plvr.length() - 1)) {
            return false;
        }

        return palindromo(plvr.substring(1, plvr.length() - 1));
    }
}