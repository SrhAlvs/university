package aula2025_09_09.lista08parte02;

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro (a partir de 1): ");
        int num = scanner.nextInt();

//      int contador=1, sum=0;
        int resultado = somaAteN(num);

        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }

//    public static int somaAteN(int n, int i, int soma) {
//        if (i >= n){
//            return soma + i;
//        } else {
//            soma = soma + i;
//            i++;
//            return somaAteN(n, i, soma);
//        }
//    }
    public static int somaAteN(int n) {
        if (n > 1) {
            return n + somaAteN((n - 1));
        } else {
            return n;
        }
    }
}
