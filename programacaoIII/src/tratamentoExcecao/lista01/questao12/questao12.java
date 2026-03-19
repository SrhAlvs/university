package tratamentoExcecao.lista1.questao12;

public class questao12 {
    void main() {
        try (ProcessadorTarefas processador = new ProcessadorTarefas()) {
            processador.executarTarefa("Processar relatório");
            processador.executarTarefa("Atualizar dados");
            processador.executarTarefa("Gerar estatísticas");
        } catch (Exception e) { //feio? sim, mas eu não sabia o que colocar aqui hahahhah
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
