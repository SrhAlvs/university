package aula2025_11_18.lista12.questao01;

public class Estagiario extends Funcionario {
    private double cargaHoraria, valorBolsa;

    public Estagiario(
            String nome,
            long cpf,
            double salarioBase,
            double cargaHoraria,
            double valorBolsa) {
        super(nome, cpf, salarioBase);
        setCargaHoraria(cargaHoraria);
        setValorBolsa(valorBolsa);
    }

    public double getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(double cargaHoraria) { this.cargaHoraria = (cargaHoraria < 0) ? 0 : cargaHoraria; }

    public double getValorBolsa() { return valorBolsa; }
    public void setValorBolsa(double valorBolsa) { this.valorBolsa = (valorBolsa < 0) ? 0 : valorBolsa; }

    @Override
    public double calcularSalario() {
        return getCargaHoraria() * getValorBolsa();
    }
}
