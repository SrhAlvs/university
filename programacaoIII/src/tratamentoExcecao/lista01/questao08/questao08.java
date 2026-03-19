package tratamentoExcecao.lista1.questao08;

import java.util.Scanner;

public class questao08 {
    void main() {
        Scanner scanner = new Scanner(System.in);

        try {
            IO.print("Insira um número inteiro: ");
            int num = scanner.nextInt();
            validarNumero(num);
        } catch (NumeroNegativoException e) {
            IO.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            IO.println("Erro: Não foi possível converter. Letras, símbolos e/ou caracteres diferentes de números foram inseridos.");
        } finally {
            scanner.close();
            IO.println("Programa encerrado.");
        }
    }

    static void validarNumero(int num) throws NumeroNegativoException {
        if (num < 0) {
            throw new NumeroNegativoException("Erro: números negativos não são permitidos.");
        }
        IO.println("Número " + num + " armazenado com sucesso!");
    }
}
