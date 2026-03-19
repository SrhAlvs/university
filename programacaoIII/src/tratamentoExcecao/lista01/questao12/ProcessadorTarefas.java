package tratamentoExcecao.lista1.questao12;

public class ProcessadorTarefas implements AutoCloseable {
     public ProcessadorTarefas() {
         IO.println("Processador de tarefas iniciado.");
     }

     public void executarTarefa(String tarefa) {
         IO.println("Executando tarefa: " + tarefa);
     }

    @Override
    public void close() {
         IO.println("Processador de tarefas finalizado.");
    }
}
