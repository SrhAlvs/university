package aula2025_09_16.lista09;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de discos: ");
        int quantidadeDiscos = scanner.nextInt();

        int[] a = new int[quantidadeDiscos];

        for(int i = 0; i < quantidadeDiscos; i++) {
            a[i] = quantidadeDiscos - i;
            System.out.println(a[i]);
        }

        char origem='A', auxiliar='B', destino='C';
    }

    public static String torreHanoi(int Disco,  char a, char b, char c) {
        if (Disco == 1) {
            return "\nMova disco " + Disco + " de " + a + " → " + c;
        } else {
            return "aaa";
        }
    }
}
