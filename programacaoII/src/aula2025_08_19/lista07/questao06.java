package aula2025_08_19.lista07;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();

        int vetor1[] = new int[tamanho];
        int vetor2[] = new int[tamanho];
        int vetor3[] = new int[2*tamanho];

        for (int i=0; i<tamanho; i++) {
            System.out.println("Informe o valor da posição " + i + " do vetor 1: ");
            vetor1[i] = scanner.nextInt();
            System.out.println("Informe o valor da posição " + i + " do vetor 2: ");
            vetor2[i] = scanner.nextInt();
        }

        for (int i=0, j=0; j < 2*tamanho; j++, i++) {
            vetor3[j] = vetor1[i];
            j++;
            vetor3[j] = vetor2[i];
        }

        System.out.println("Vetor 1: ");
        for (int i=0; i<tamanho; i++) {
            System.out.print(vetor1 + " ");
        }

        System.out.println("Vetor 2: ");
        for (int i=0; i<tamanho; i++) {
            System.out.print(vetor2 + " ");
        }

        System.out.println("Vetor resultante: ");
        for (int i=0; i < 2*tamanho; i++) {
            System.out.print(vetor3 + " ");
        }

        scanner.close();
    }
}
