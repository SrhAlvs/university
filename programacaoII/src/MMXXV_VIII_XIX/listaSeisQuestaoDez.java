package MMXXV_VIII_XIX;

import java.util.Scanner;

public class listaSeisQuestaoDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor inteiro positivo: ");
        int num = scanner.nextInt();

        for (int i = num; i>=0; i--) {
            System.out.println(i);
        }
    }
}
