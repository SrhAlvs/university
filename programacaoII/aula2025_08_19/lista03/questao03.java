package aula2025_08_19.lista03;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira 4 notas: ");
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float nota3 = scanner.nextFloat();
        float nota4 = scanner.nextFloat();
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Média das notas: " + media);
        scanner.close();
    }
}
