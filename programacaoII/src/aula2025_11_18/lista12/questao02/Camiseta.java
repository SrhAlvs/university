package aula2025_11_18.lista12.questao02;

public class Camiseta extends Produto {
    private String tamanho, estampa;

    public Camiseta(
            String descricao,
            double precoCusto,
            String tamanho,
            String estampa) {
        super(descricao, precoCusto);
        setTamanho(tamanho);
        setEstampa(estampa);
    }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = (tamanho == null) ? "--não informado--" : tamanho; }

    public String getEstampa() { return estampa; }
    public void setEstampa(String estampa) { this.estampa = (estampa == null) ? "--não informada--" : estampa; }

    @Override
    public double calcularPrecoVenda() {
        double margemLucro = 0.20; // 20% de lucro
        double precoVenda = getPrecoCusto() + (getPrecoCusto() * margemLucro);

        if (!getTamanho().equalsIgnoreCase("GG")) {
            return precoVenda - (precoVenda * 0.05);
        }

        return precoVenda;
    }
}
