package tratamentoExcecao.lista1;

import java.util.Scanner;

public class questao03 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        IO.print("Insira um valor inteiro: ");
        String possivelNumero = scanner.nextLine();

        try {
            int numeroConvertido = Integer.parseInt(possivelNumero);
            IO.println("Número digitado: " + numeroConvertido);
        } catch (NumberFormatException e) {
            IO.println("Erro: Não foi possível converter. Letras, símbolos e/ou caracteres diferentes de números foram inseridos.");
        } finally {
            scanner.close();
            IO.println("Programa encerrado.");
        }

    }
}
