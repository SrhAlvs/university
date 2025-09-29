package aula2025_09_09.lista08parte02;

import java.util.Scanner;

public class questao23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma frase: ");
        String frase = scanner.nextLine();

        System.out.print("Insira o caractere que deseja contar: ");
        char caractere = scanner.next().charAt(0);

        int resultado = contarCaractere(frase, caractere);
        System.out.println("O caractere '" + caractere + "' aparece " + resultado + " vezes na frase.");

        scanner.close();
    }

    public static int contarCaractere(String str, char ch) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int contagem = 0;
        if (str.charAt(0) == ch) {
            contagem = 1;
        }

        return contagem + contarCaractere(str.substring(1), ch);
    }
}
