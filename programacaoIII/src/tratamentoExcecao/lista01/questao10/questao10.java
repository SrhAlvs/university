package tratamentoExcecao.lista1.questao10;

import tratamentoExcecao.lista1.questao08.NumeroNegativoException;

import java.util.Scanner;

public class questao10 {
    void main() {
        Scanner scanner = new Scanner(System.in);

            IO.print("Preencha com seus dados:" + "\nNome: ");
            String nome = scanner.nextLine();

            IO.print("Idade: ");
            int idade = scanner.nextInt();

            IO.print("Salário: ");
            double salario = scanner.nextDouble();

        try {
            validarNome(nome);
            validarIdade(idade);
            validarSalario(salario);

            IO.println("Dados cadastrados com sucesso!");
        } catch (StringNulaException e) {
            IO.println(e.getMessage());
        } catch (IdadeZeroException e) {
            IO.println(e.getMessage());
        } catch (NumeroNegativoException e) {
            IO.println(e.getMessage());
        } finally {
            scanner.close();
            IO.println("Programa encerrado.");
        }
    }

    static void validarNome(String nome) throws StringNulaException {
        if (nome==null || nome.isEmpty()) {
            throw new StringNulaException("Erro (nome): o nome não pode estar vazio.");
        }
    }

    static void validarIdade(int idade) throws IdadeZeroException {
        if (idade <= 0) {
            throw new IdadeZeroException("Erro (idade): a idade deve ser maior que zero.");
        }
    }

    static void validarSalario(double salario) throws NumeroNegativoException {
        if (salario < 0) {
            throw new NumeroNegativoException("Erro (salário): números negativos não são permitidos.");
        }
    }
}
