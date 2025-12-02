package aula2025_11_18.lista12.questao02;

public class Sapato extends Produto {
    private int tamanho;
    private String tipo;

    public Sapato(
            String descricao,
            double precoCusto,
            int tamanho,
            String tipo) {
        super(descricao, precoCusto);
        setTamanho(tamanho);
        setMaterial(tipo);
    }

    public int getTamanho() { return tamanho; }
    public void setTamanho(int tamanho) { this.tamanho = (tamanho < 0) ? 0 : tamanho; }

    public String getMaterial() { return tipo; }
    public void setMaterial(String tipo) { this.tipo = (tipo == null) ? "--não informado--" : tipo; }

    @Override
    public double calcularPrecoVenda() {
        double markup = 1.5;
        double taxaImportacao = 10.00;

        return (getPrecoCusto() * markup) + taxaImportacao;
    }
}
