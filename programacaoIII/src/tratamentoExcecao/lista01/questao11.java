package tratamentoExcecao.lista1;

import java.util.Scanner;

public class questao11 {
    void main() {

        try (Scanner scanner = new Scanner(System.in)) {
            IO.print("Digite 3 números inteiros: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            double mediaAritmetica = (double) ((num1 + num2 + num3)/3);

            IO.println("Resultado da média aritmética: " + mediaAritmetica);

        } catch (java.util.InputMismatchException e) {
            IO.println("Erro: Letras, símbolos e/ou caracteres diferentes de números foram inseridos.");
        } finally {
            IO.println("Programa encerrado.");
        }

        //DEMONSTRAÇÃO:
        //se eu tentar digitar 'scanner.nextInt();' aqui fora,
        //o Java apresentará um erro de compilação dizendo que não conhece a variável 'scanner'.
        //isso prova que o recurso foi encerrado.
    }
}
