package tratamentoExcecao.lista1;

import java.util.Scanner;

public class questao04 {
    void main() {
        Scanner scanner = new Scanner(System.in);

        IO.print("Insira dois números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try {
            int resultado = num1/num2;
            IO.println("Resultado: " + resultado);
        } catch(ArithmeticException e) {
            IO.println("Erro: divisão por zero não é permitida.");
        } finally {
            scanner.close();
            IO.println("Encerrando operação da calculadora.");
        }
    }
}
