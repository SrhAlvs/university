package aula2025_09_23.lista10.questao02;

public class appProprietario {
    static void main() {
        Proprietario p1 = new Proprietario("Ronaldo", "12345678901", "00000000");
        p1.setDataNascimento(31, 6, 1970);
        p1.exibirAtributos();

        Proprietario p2 = new Proprietario("Joyce", "123", "46800000");
        p2.setDataNascimento(5, 4, 1999);
        p2.exibirAtributos();

        Proprietario p3 = new Proprietario("Karla", "88833399945", "46800456");
        p3.setDataNascimento(30, 9, 2);
        p3.exibirAtributos();
    }
}
