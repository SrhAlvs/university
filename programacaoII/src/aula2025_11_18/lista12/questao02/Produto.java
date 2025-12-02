package aula2025_11_18.lista12.questao02;

public abstract class Produto {
    private String descricao;
    private double precoCusto;

    public Produto(String descricao, double precoCusto) {
        setDescricao(descricao);
        setPrecoCusto(precoCusto);
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = (descricao == null) ? "--não informada--" : descricao; }

    public double getPrecoCusto() { return precoCusto; }
    public void setPrecoCusto(double precoCusto) { this.precoCusto = (precoCusto < 0) ? 0 : precoCusto; }

    public abstract double calcularPrecoVenda();
}
