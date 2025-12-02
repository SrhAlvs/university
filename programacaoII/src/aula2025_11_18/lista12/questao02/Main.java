package aula2025_11_18.lista12.questao02;

public class Main {
    static void main() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Camiseta c1 = new Camiseta("Camiseta Steven Universe", 50.00, "M", "Estrela");
        Calca c2 = new Calca("Calça Jeans Rasgada", 80.00, "40", "Jeans");
        Calca c3 = new Calca("Calça de Show", 150.00, "38", "Couro");
        Sapato s1 = new Sapato("Tênis de Corrida", 120.00, 42, "Esportivo");

        carrinho.adicionarProduto(c1);
        carrinho.adicionarProduto(c2);
        carrinho.adicionarProduto(c3);
        carrinho.adicionarProduto(s1);

        double valorFinal = carrinho.calcularTotal();

        System.out.println("\n>>> RESUMO DA COMPRA <<<");
        System.out.println("Valor Final a Pagar: R$ " + String.format("%.2f", valorFinal));
    }
}
