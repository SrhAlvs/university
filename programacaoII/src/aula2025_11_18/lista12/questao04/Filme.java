package aula2025_11_18.lista12.questao04;

public class Filme extends Midia {
    private String diretor;
    private double duracao; // em minutos

    public Filme(String titulo, int anoLancamento, String diretor, double duracao) {
        super(titulo, anoLancamento);
        setDiretor(diretor);
        setDuracao(duracao);
    }

    public String getDiretor() { return diretor; }
    public void setDiretor(String diretor) { this.diretor = (diretor == null) ? "--diretor não informado--" : diretor; }

    public double getDuracao() { return duracao; }
    public void setDuracao(double duracao) { this.duracao = (duracao < 0) ? 0 : duracao; }

    @Override
    public void exibirDetalhes() {
        System.out.println("[FILME] Título: " + getTitulo());
        System.out.println("        Ano: " + getAnoLancamento());
        System.out.println("        Diretor: " + getDiretor());
        System.out.println("        Duração: " + getDuracao() + " min");
    }
}