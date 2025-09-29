package aula2025_09_02.lista08parte01;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma frase ou palavra: ");
        String abc = scanner.nextLine();

        System.out.println("Quantidade de vogais: " + quantidadeVogais(abc));

        scanner.close();
    }

    public static int quantidadeVogais(String texto) {
        int contador = 0;
        String vogais = "aeiou";

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (vogais.indexOf(caractere) != -1) {
                contador++;
            }
        }
        return contador;
    }
}
