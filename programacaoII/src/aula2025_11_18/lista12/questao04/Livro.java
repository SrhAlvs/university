package aula2025_11_18.lista12.questao04;

public class Livro extends Midia {
    private String autor;
    private String editora;

    public Livro(String titulo, int anoLancamento, String autor, String editora) {
        super(titulo, anoLancamento);
        setAutor(autor);
        setEditora(editora);
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = (autor == null) ? "--autor desconhecido--" : autor; }

    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = (editora == null) ? "--editora não informada--" : editora; }

    @Override
    public void exibirDetalhes() {
        System.out.println("[LIVRO] Título: " + getTitulo());
        System.out.println("        Ano: " + getAnoLancamento());
        System.out.println("        Autor: " + getAutor());
        System.out.println("        Editora: " + getEditora());
    }
}