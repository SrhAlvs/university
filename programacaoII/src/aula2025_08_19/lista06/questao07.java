package aula2025_08_19.lista06;

import java.util.Scanner;

public class questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num = scanner.nextInt();

        int fatorial = 1;

        if (num>0) {
            for (int i = num; i>=1; i--) {
                fatorial = fatorial*i;
            }
            System.out.println("O resultado de " + num + "! é: " + fatorial);
        } else if (num==0) {
            System.out.println("O resultado de 0! é: 1");
        } else {
            System.out.println("Não existe fatorial de número negativo.");
        }
        scanner.close();
    }
}
