package aula2025_09_23.lista10.questao03;

public class AppCarro {
    static void main() {
    Carro c1 = new Carro(15, 6, 50);

        System.out.println(c1.acelerar());
        System.out.println(c1.trocarDeMarcha());
        System.out.println(c1.freiar());
        System.out.println(c1.reduzirMarcha());
        System.out.println(c1.kmPorLitro(350));
    c1.exibirAtributos();

    }
}
