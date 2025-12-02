package aula2025_11_18.lista12.questao02;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> listaDeProdutos;

    public CarrinhoDeCompras() { this.listaDeProdutos = new ArrayList<>(); }

    public void adicionarProduto(Produto p) {
        this.listaDeProdutos.add(p);
        System.out.println("Item adicionado ao carrinho: " + p.getDescricao());
    }

    public double calcularTotal() {
        double totalCarrinho = 0.0;

        System.out.println("\n--------- Resumo do Carrinho ---------");

        for (Produto produto : this.listaDeProdutos) {
            double precoItem = produto.calcularPrecoVenda();

            System.out.println(produto.getDescricao() + ": R$ " + String.format("%.2f", precoItem));

            totalCarrinho += precoItem;
        }

        System.out.println("--------------------------");
        return totalCarrinho;
    }
}
