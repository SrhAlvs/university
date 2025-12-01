package aula2025_11_18.lista12.questao01;

public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas, valorHora;

    public FuncionarioHorista(
            String nome,
            long cpf,
            double salarioBase,
            double horasTrabalhadas,
            double valorHora) {
        super(nome, cpf, salarioBase);
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHora(valorHora);
    }

    public double getHorasTrabalhadas() { return horasTrabalhadas; }
    public void setHorasTrabalhadas(double horasTrabalhadas) { this.horasTrabalhadas = (horasTrabalhadas < 0) ? 0 : horasTrabalhadas; }

    public double getValorHora() { return valorHora; }
    public void setValorHora(double valorHora) { this.valorHora = (valorHora < 0) ? 0 : valorHora; }

    @Override
    public double calcularSalario() {
        return getHorasTrabalhadas() * getValorHora();
        /* Porque escolhi fazer assim?
         * se eu receber os valores como atributo, seria possível calcular diversos salários sem utilizar o que está salvo no sistema,
         * do modo que fiz, o método utiliza sempre o valor salvo no sistema logo,
         * se seu salário está errado, significa que ele não está salvo corretamente no sistema :D */
    }
}
