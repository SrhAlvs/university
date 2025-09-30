package aula2025_09_23;

public class Aplicativo {
    static void main(String[] args) { //classe executável
        Pessoa p1 = new Pessoa(); //construtor padrão ou vazio (nome: null, idade: 0)
        Pessoa p2 = new Pessoa("Daniel", 42); //construtor completo
        Pessoa p3;

        p1.exibirAtributos();
        p1.setNome(null);
        p1.setIdade(-30);
        p1.exibirAtributos();
        p2.exibirAtributos();
    }
}
