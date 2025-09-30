package aula2025_09_23.lista10.questao01;

public class AppFuncionario {
    static void main() {
        java.text.DecimalFormat duasCasasDecimais = new java.text.DecimalFormat("0.00");

        Funcionario f1 = new Funcionario("Daniel", "Hartman", 1500.32);
        Funcionario f2 = new Funcionario("Elizabeth", "Webber", 3845.54);
        Funcionario f3 = new Funcionario("Arthur", "Servero", -94.62);

        System.out.println("\n-------------------------------------------------");
        f1.exibirAtributos(); System.out.print("\n");
        f2.exibirAtributos(); System.out.print("\n");
        f3.exibirAtributos();

        double salarioAnual1 = f1.getSalarioMensal() * 12;
        double salarioAnual2 = f2.getSalarioMensal() * 12;
        double salarioAnual3 = f3.getSalarioMensal() * 12;

        System.out.println("\n-------------------------------------------------");
        System.out.println("Salário anual de " + f1.getFirstName() + ": " + duasCasasDecimais.format(salarioAnual1));
        System.out.println("Salário anual de " + f2.getFirstName() + ": " + duasCasasDecimais.format(salarioAnual2));
        System.out.println("Salário anual de " + f3.getFirstName() + ": " + duasCasasDecimais.format(salarioAnual3));

        System.out.println("\n-------------------------------------------------");
        System.out.println("Salário anual com aumento de 10% de " + f1.getFirstName() + ": " + duasCasasDecimais.format(salarioAnual1*1.10));
        System.out.println("Salário anual com aumento de 10% de " + f2.getFirstName() + ": " + duasCasasDecimais.format(salarioAnual2*1.10));
        System.out.println("Salário anual com aumento de 10% de " + f3.getFirstName() + ": " + duasCasasDecimais.format(salarioAnual3*1.10));
    }
}
