package prova2025_12_09;

public class Main {
    static void main() {
        ArCondicionado a1 = new ArCondicionado("a1", 9000, 8500, 8.5, true);
        a1.exibirAtributos();
        System.out.println(a1.ligado());
        System.out.println("Status: " + a1.consultarStatus());
        System.out.println("Gasto mensal previsto: " + a1.gastoMensalPrevisto());
        System.out.println("Gasto mensal: " + a1.gastoMensal());
        dividirEscopo();

        Geladeira g1 = new Geladeira("g1", 7000, 4550, 24, true);
        g1.exibirAtributos();
        System.out.println(g1.ligado());
        System.out.println("Status: " + g1.consultarStatus());
        System.out.println("Gasto mensal previsto: " + g1.gastoMensalPrevisto());
        System.out.println("Gasto mensal: " + g1.gastoMensal());
        dividirEscopo();

        Lampada l1 = new Lampada("l1", 50, 25, 4.8, true, 12);
        l1.exibirAtributos();
        System.out.println(l1.ligado());
        System.out.println("Status: " + l1.consultarStatus());
        System.out.println("Gasto mensal previsto: " + l1.gastoMensalPrevisto());
        System.out.println("Gasto mensal: " + l1.gastoMensal());
        dividirEscopo();

    }

    public static void dividirEscopo() {
        System.out.print("\n--------------------------------------------\n\n");
    }
}
