package aula2025_09_30.lista11.questao04;

public class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco) {
        setEndereco(endereco);
        setPreco(preco);
    }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = (endereco == null) ? "" : endereco; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = (preco > 0) ? 0 : preco; }

}
