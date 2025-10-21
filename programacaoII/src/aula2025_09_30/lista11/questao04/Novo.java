package aula2025_09_30.lista11.questao04;

public class Novo extends Imovel {
    private double adicionalPreco;

    public Novo(String endereco, double preco, double adicionalPreco) {
        super(endereco, preco);
        setAdicionalPreco(adicionalPreco);
    }

    public double getAdicionalPreco() { return adicionalPreco; }
    public void setAdicionalPreco(double adicionalPreco) { this.adicionalPreco = (adicionalPreco < 0) ? 0 : adicionalPreco; }

    public void imprimirPreco() {
        System.out.println("Preço inicial: " + getPreco());
        System.out.println("Preço com adicional: " + (getPreco() + getAdicionalPreco()));
    }
}
