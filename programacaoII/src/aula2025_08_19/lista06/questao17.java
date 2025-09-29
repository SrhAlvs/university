package aula2025_08_19.lista06;

import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num = scanner.nextInt();
        int aux = 1;

        while (aux <= num) {
            if ((num%aux) == 0) {
                System.out.print(aux + " ");
            }
            aux++;
            if (aux > (num/2)) {
                System.out.println(num);
                break;
            }
        }
    }
}
