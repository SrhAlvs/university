package aula2025_11_18.lista12.questao01;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {
    private List<Funcionario> listaFuncionarios;

    public FolhaPagamento() {
        this.listaFuncionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        this.listaFuncionarios.add(f);
        System.out.println("Funcionário " + f.getNome() + " adicionado à folha.");
    }

    public double processarFolha() {
        double totalPagamentos = 0.0;
        System.out.println("--------- Folha de Pagamento ---------");

        /* (for-each) para cada funcionário 'func' dentro da listaFuncionarios...
        * também poderia ser assim:
        * for (int i = 0; i < listaFuncionarios.size(); i++)*/
        for (Funcionario func : this.listaFuncionarios) {
            double salario = func.calcularSalario();
            totalPagamentos += salario;
        }

        System.out.println("--------------------------------------");
        System.out.println("Total a pagar: R$ " + totalPagamentos);

        return totalPagamentos;
    }
}