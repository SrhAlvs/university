package tratamentoExcecao.lista1;

import java.util.Scanner;

public class questao09 {
    void main() {
        Scanner scanner = new Scanner(System.in);

        int[] operacao = new int[4];

        IO.print("""
                Bem-vind@ a esta calculadora! O que deseja fazer hoje?\
               
                1 - Soma\
                
                2 - Subtração\
                
                3 - Multiplicação\
                
                4 - Divisão\
                
                Insira aqui sua escolha:""");

        try {
            int escolhaMenu = scanner.nextInt();
            escolhaMenu--;

            IO.print("Agora insira dois números inteiros: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            operacao[0] = (num1 + num2);
            operacao[1] = (num1 - num2);
            operacao[2] = (num1 * num2);
            operacao[3] = (num1 / num2);

            int resultado = operacao[escolhaMenu];

            IO.println("Resultado da operação: " + resultado);
        } catch (ArrayIndexOutOfBoundsException e) {
            IO.println("Erro: Escolha de operação inválida.");
        } catch (ArithmeticException e) {
            IO.println("Erro: divisão por zero não é permitida.");
        } catch (java.util.InputMismatchException e) { //peguei essa "forma de tratamento" do próprio erro do terminal
            IO.println("Erro: Letras, símbolos e/ou caracteres diferentes de números foram inseridos.");
        } finally {
            scanner.close();
            IO.println("Programa encerrado.");
        }
    }
}
