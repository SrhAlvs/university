package aula2025_11_18.lista12.questao01;

public class Main {
    static void main() {
        FolhaPagamento folha = new FolhaPagamento();

        FuncionarioHorista ametista = new FuncionarioHorista("Ametista", 111222333L, 0.0, 40, 50.0);
        ametista.imprimirDados();

        FuncionarioMensalista garnet = new FuncionarioMensalista("Garnet", 55566677788L, 3000.0, 500.0);
        garnet.imprimirDados();

        Estagiario steven = new Estagiario("Steven", 99988877766L, 0.0, -20, 30.0);
        steven.imprimirDados();

        System.out.println();
        folha.adicionarFuncionario(ametista);
        folha.adicionarFuncionario(garnet);
        folha.adicionarFuncionario(steven);

        System.out.println();
        folha.processarFolha();
    }
}
