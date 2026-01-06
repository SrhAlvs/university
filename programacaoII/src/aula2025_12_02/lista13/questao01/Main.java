package aula2025_12_02.lista13.questao01;

public class Main {
    static void main() {
        OperacaoAritmetica soma = new Soma();
        OperacaoAritmetica subt = new Subtracao();
        OperacaoAritmetica mult = new Multiplicacao();
        OperacaoAritmetica divi = new Divisao();

        int n1 = 6, n2 = 2;
        double n3 = 7.2, n4 = 1.2;

        System.out.println(soma.calcular(n1, n2));
        System.out.println(soma.calcular(n3, n4));

        System.out.println(subt.calcular(n1, n2));
        System.out.println(subt.calcular(n3, n4));

        System.out.println(mult.calcular(n1, n2));
        System.out.println(mult.calcular(n3, n4));

        System.out.println(divi.calcular(n1, n2));
        System.out.println(divi.calcular(n3, n4));
    }
}
