package aula2025_08_19.lista03;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o número de horas trabalhadas: ");
        float horasTrabalhadas = scanner.nextFloat();
        System.out.print("Insira o valor por hora: ");
        float valorHoras = scanner.nextFloat();
        double salarioTotal = horasTrabalhadas * valorHoras;
        System.out.println("Salário total: " + salarioTotal);
        scanner.close();
    }
}
