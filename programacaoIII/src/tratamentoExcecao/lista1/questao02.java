package tratamentoExcecao.lista1;

import java.util.Scanner;

public class questao02 {
    void main() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];
        vetor[0] = 5;
        vetor[1] = 4;
        vetor[2] = 3;
        vetor[3] = 2;
        vetor[4] = 1;

        IO.print("Insira o índice deseja visualizar: ");
        int index = scanner.nextInt();

        try {
            IO.println("Valor armazenado no índice '" + index + "': " + vetor[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            IO.println("Erro: Índice fora do limite do vetor.");
        } finally {
            scanner.close();
            IO.println("Programa encerrado.");
        }

        IO.println("Lalala pipoca, não quero saber de fofoca... o programa continua rodando eeeehhh!");
    }
}
