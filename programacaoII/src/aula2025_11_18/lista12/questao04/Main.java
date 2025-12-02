package aula2025_11_18.lista12.questao04;

public class Main {
    static void main() {
        Biblioteca biblio = new Biblioteca();

        System.out.println("--------- 1. CADASTRANDO MÍDIAS ---------");
        Livro l1 = new Livro("O Senhor dos Anéis", 1954, "J.R.R. Tolkien", "Allen & Unwin");
        Filme f1 = new Filme("Interestelar", 2014, "Christopher Nolan", 169);
        Livro l2 = new Livro("Java: Como Programar", 2017, "Deitel", "Pearson");

        ItemBiblioteca item1 = new ItemBiblioteca(l1, "Estante A - Ficção", "Disponível");
        ItemBiblioteca item2 = new ItemBiblioteca(f1, "Corredor B - SciFi", "Emprestado");
        ItemBiblioteca item3 = new ItemBiblioteca(l2, "Estante C - Informática", null);

        item2.setStatusEmprestimo("Emprestado");

        biblio.adicionarItem(item1);
        biblio.adicionarItem(item2);
        biblio.adicionarItem(item3);

        biblio.listarAcervo();

        biblio.removerPorTitulo("Interestelar");

        biblio.removerPorTitulo("Harry Potter");

        System.out.println("\n--------- 3. ACERVO FINAL ---------");
        biblio.listarAcervo();
    }
}