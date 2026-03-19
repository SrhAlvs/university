package tratamentoExcecao.lista1;

import java.util.Scanner;

public class questao05 {
    void main() {
        Scanner scanner = new Scanner(System.in);

        IO.print("Insira um valor inteiro: ");
        String possivelNumero = scanner.nextLine();

        int[] vetor = new int[3];
        IO.print("Insira o índice para armazenar o valor (vetor de 3 posições): ");
        int index = scanner.nextInt();

        try {
            int numeroConvertido = Integer.parseInt(possivelNumero);

            vetor[index] = numeroConvertido;

            IO.println("Número " + numeroConvertido + " armazenado na posição " + index + " do vetor.");
        } catch (NumberFormatException e) {
            IO.println("Erro: Não foi possível converter. Letras, símbolos e/ou caracteres diferentes de números foram inseridos.");
        } catch (ArrayIndexOutOfBoundsException e) {
            IO.println("Erro: Índice fora do limite do vetor.");
        } finally {
            scanner.close();
            IO.println("Programa encerrado.");
        }










        scanner.close();
    }
}
