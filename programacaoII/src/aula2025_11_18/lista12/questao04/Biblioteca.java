package aula2025_11_18.lista12.questao04;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Biblioteca {
    private List<ItemBiblioteca> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca item) {
        this.acervo.add(item);
        System.out.println("Item '" + item.getMidia().getTitulo() + "' adicionado ao acervo.");
    }

    // Retorna o item se encontrar ou null se não encontrar
    public ItemBiblioteca buscarPorTitulo(String titulo) {
        for (ItemBiblioteca item : acervo) {
            if (item.getMidia().getTitulo().equalsIgnoreCase(titulo)) {
                return item;
            }
        }
        return null;
    }

    public void removerPorTitulo(String titulo) {
        // Usa um Iterator para poder remover com segurança enquanto percorre a lista
        Iterator<ItemBiblioteca> iterator = acervo.iterator();
        boolean encontrou = false;

        while (iterator.hasNext()) {
            ItemBiblioteca item = iterator.next();
            if (item.getMidia().getTitulo().equalsIgnoreCase(titulo)) {
                iterator.remove();
                System.out.println("Item '" + titulo + "' removido com sucesso.");
                encontrou = true;
                break; // Remove apenas o primeiro encontrado e para
            }
        }

        if (!encontrou) {
            System.out.println("Não foi possível remover: '" + titulo + "' não encontrado no acervo.");
        }
    }

    public void listarAcervo() {
        System.out.println("\n>>> ACERVO DA BIBLIOTECA <<<");
        if (acervo.isEmpty()) {
            System.out.println("O acervo está vazio.");
        } else {
            for (ItemBiblioteca item : acervo) {
                item.imprimirFichaCatalografica();
            }
        }
    }
}