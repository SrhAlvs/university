package aula2025_11_18.lista12.questao04;

public class ItemBiblioteca {
    private Midia midia;
    private String codigoLocalizacao;
    private String statusEmprestimo; //"Disponível", "Emprestado", "Atrasado"

    public ItemBiblioteca(Midia midia, String codigoLocalizacao, String statusEmprestimo) {
        this.midia = midia;
        setCodigoLocalizacao(codigoLocalizacao);
        setStatusEmprestimo(statusEmprestimo);
    }

    public String getCodigoLocalizacao() { return codigoLocalizacao; }
    public void setCodigoLocalizacao(String codigoLocalizacao) {
        this.codigoLocalizacao = (codigoLocalizacao == null) ? "Geral" : codigoLocalizacao;
    }

    public String getStatusEmprestimo() { return statusEmprestimo; }
    public void setStatusEmprestimo(String statusEmprestimo) { this.statusEmprestimo = (statusEmprestimo == null) ? "Indefinido" : statusEmprestimo; }

    public void imprimirFichaCatalografica() {
        System.out.println("--------- ITEM DO ACERVO ---------");
        System.out.println("Localização: " + getCodigoLocalizacao());
        System.out.println("Status: " + getStatusEmprestimo());
        if (midia != null) {
            midia.exibirDetalhes();
        } else {
            System.out.println("Erro: Mídia não associada.");
        }
        System.out.println("----------------------------------\n");
    }

    public Midia getMidia() { return midia; }
}