package aula2025_11_18.lista12.questao01;

public class FuncionarioMensalista extends Funcionario {
    private double beneficios;

    public FuncionarioMensalista(
            String nome,
            long cpf,
            double salarioBase,
            double beneficios) {
        super(nome, cpf, salarioBase);
        setBeneficios(beneficios);
    }

    public double getBeneficios() { return beneficios; }
    public void setBeneficios(double beneficios) { this.beneficios = (beneficios < 0) ? 0 : beneficios; }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + getBeneficios();
    }
}
