package aula2025_09_09.lista08parte02;

import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade de números a serem somados: ");
        int quantidade = scanner.nextInt();
        int[] listaValores = new int[quantidade];

        for (int k = 0; k < quantidade; k++) {
            System.out.print("Insira o valor do número na posição "+k+": ");
            listaValores[k] = scanner.nextInt();
        }
        int j=0;
        System.out.println("Resultado: " + soma(listaValores,j));

        scanner.close();
    }

    public static int soma(int[] lista, int i) {
        if(i >= lista.length) {
            return 0;
        }

        return lista[i] + soma(lista, i + 1);
    }
}
