package prova2025_10_21;

public class testeDrone {
    public static void main () {
        Drone d1 = new Drone(123456, 100, "nem ideia",10, 250, 75);
        d1.exibirResumo();
        d1.exibirTempoEstimado(25);
        dividirEscopo();

        Leve dl1 = new Leve(654321, 100, "não sei", 5, 200, 80, 2.5);
        dl1.exibirResumo();
        dl1.exibirConsumo(50);
        dividirEscopo();

        Pesado dp1 = new Pesado(214365, 100, "tô sem criatividade", 20, 150, 50);
        dp1.exibirResumo();
        dp1.exibirConsumo(15, 45);
        dividirEscopo();
    }
    public static void dividirEscopo() {
        System.out.println("\n----------------------------------------\n");
    }
}
