package aula2025_08_19.lista05;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vind@ a esta calculadora!");

        System.out.print("Insira dois valores: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Qual operação deseja realizar? Observe a lista a seguir: ");
        System.out.println(" - digite '+' para somar;");
        System.out.println(" - digite '-' para subtrair;");
        System.out.println(" - digite '*' para multiplicar;");
        System.out.println(" - digite '/' para dividir.");

        System.out.print("Operação: ");
        char operacao = scanner.next().charAt(0); //resolvi arriscar e ver se dessa forma funciona

        if((operacao=='+') || (operacao=='-') || (operacao=='*') || (operacao=='/')) {
            double resultado=0;

            if (operacao == '+') {
                resultado = num1 + num2;
            } else if (operacao == '-') {
                resultado = num1 - num2;
            } else if (operacao == '*') {
                resultado = num1 * num2;
            } else {
                if (num2 == 0) {
                    System.out.println("Divisão por zero não é permitida");
                } else {
                    resultado = num1 / num2;
                }
            }

            if (resultado > 1000) {
                System.out.println("Resultado muito grande");
            } else if (resultado < -1000) {
                System.out.println("Resultado muito negativo");
            } else {
                System.out.println("Resultado: " + resultado);
            }

        } else {
            System.out.println("Operação inválida");
        }
        scanner.close();
    }
}
