package aula2025_09_30.lista11.questao04;

public class Velho extends Imovel {
    private double descontoPreco;

    public Velho(String endereco, double preco, double descontoPreco) {
        super(endereco, preco);
    }

    public double getDescontoPreco() { return descontoPreco; }
    public void setDescontoPreco(double descontoPreco) { this.descontoPreco = (descontoPreco > 0) ? 0 : descontoPreco; }

    public void imprimirPreco() {
        System.out.println("Preço inicial: " + getPreco());
        System.out.println("Preço com desconto: " + getDescontoPreco());
    }
}
