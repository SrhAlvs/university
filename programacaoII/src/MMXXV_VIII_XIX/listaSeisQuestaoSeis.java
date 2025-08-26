package MMXXV_VIII_XIX;

import java.util.Scanner;

public class listaSeisQuestaoSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro positivo: ");
        int num = scanner.nextInt();


        int numeroInvertido = 0;
        int aux = num;

        while (aux > 0) {
            int digito = aux%10;

            numeroInvertido = numeroInvertido*10 + digito;

            aux = aux/10;
        }

        System.out.println("O número invertido de " + num + " é: " + numeroInvertido);
    }
}
