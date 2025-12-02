package aula2025_11_18.lista12.questao04;

public abstract class Midia {
    private String titulo;
    private int anoLancamento;

    public Midia(String titulo, int anoLancamento) {
        setTitulo(titulo);
        setAnoLancamento(anoLancamento);
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = (titulo == null) ? "--sem título--" : titulo; }

    public int getAnoLancamento() { return anoLancamento; }
    public void setAnoLancamento(int anoLancamento) { this.anoLancamento = (anoLancamento < 0) ? 0 : anoLancamento; }

    public abstract void exibirDetalhes();
}