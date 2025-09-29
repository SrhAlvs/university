package aula2025_09_09.lista08parte02;

import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Insira o segundo número: ");
        int num2 = scanner.nextInt();

        int maior=num1, menor=num2, sobra=1;
        if (num1<num2) {
            maior = num2;
            menor = num1;
        }

        System.out.println("Maior Divisor Comum (MDC): " + mdc(maior, menor, sobra));

        scanner.close();
    }

    public static int mdc(int nMaior, int nMenor, int resto) {
        resto = nMaior%nMenor;
        if (resto == 0) {
            return nMenor;
        }
        nMaior = nMenor;
        nMenor = resto;
        return mdc(nMaior, nMenor, resto);
    }
}
