package tratamentoExcecao.lista1;

import java.util.Scanner;

public class questao06 {
    void main() {
        Scanner scanner = new Scanner(System.in);

        try {
            IO.print("Insira o preço do produto: ");
            double preco = scanner.nextDouble();
            verificarPreco(preco);
        } catch (java.util.InputMismatchException e) { //peguei essa "forma de tratamento" do próprio erro do terminal
            IO.println("Erro: Letras, símbolos e/ou caracteres diferentes de números foram inseridos.");
        } finally {
            scanner.close();
            IO.println("Programa encerrado.");
        }
    }

    static void verificarPreco(double preco) {
        if (preco <= 0) {
            throw new ArithmeticException("Erro: O preço informado é inválido para o cadastro do produto.");
            //realmente, dá erro, mas dá o erro com a mensagem personalizada
        }
        IO.println("O preço do produto foi cadastrado com sucesso.");
    }
}
