package prova2025_12_09;

public abstract class DispositivoEletronico {
    private String nome;
    private double potenciaMaximaW;
    private double potenciaEmUsoW;
    private double horasUsoDiario;
    private boolean onOff;

    public DispositivoEletronico(
            String nome,
            double potenciaMaximaW,
            double potenciaEmUsoW,
            double horasUsoDiario,
            boolean onOff
    ) {
        setNome(nome);
        setPotenciaMaximaW(potenciaMaximaW);
        setPotenciaEmUsoW(potenciaEmUsoW);
        setHorasUsoDiario(horasUsoDiario);
        this.onOff = onOff;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = (nome == null) ? "" : nome; }

    public double getPotenciaMaximaW() { return potenciaMaximaW; }
    public void setPotenciaMaximaW(double potenciaMaximaW) { this.potenciaMaximaW = (potenciaMaximaW < 0) ? 0 : potenciaMaximaW; }

    public double getPotenciaEmUsoW() { return potenciaEmUsoW; }
    public void setPotenciaEmUsoW(double potenciaEmUsoW) { this.potenciaEmUsoW = (potenciaEmUsoW < 0) ? 0 : potenciaEmUsoW; }

    public double getHorasUsoDiario() { return horasUsoDiario; }
    public void setHorasUsoDiario(double horasUsoDiario) { this.horasUsoDiario = (horasUsoDiario<0 && horasUsoDiario>24) ? 0 : horasUsoDiario; }

    public boolean getOnOff() { return onOff; }

    public abstract double gastoMensal();

    public void exibirAtributos() {
        System.out.println("--------- INFORMAÇÕES ----------");
        System.out.println("Nome: " + getNome());
        System.out.println("Potência máxima: " + getPotenciaMaximaW());
        System.out.println("Potência em uso: " + getPotenciaEmUsoW());
        System.out.println("Horas de uso diário: " + getHorasUsoDiario());
        System.out.println("--------------------------------");
    }
}
