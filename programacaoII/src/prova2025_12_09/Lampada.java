package prova2025_12_09;

public class Lampada extends DispositivoEletronico implements Operavel {
    private double fatorLuminosidade;

    public Lampada(String nome, double potenciaMaximaW, double potenciaEmUsoW, double horasUsoDiario, boolean onOff, double fatorLuminosidade) {
        super(nome, potenciaMaximaW, potenciaEmUsoW, horasUsoDiario, onOff);
        setFatorLuminosidade(fatorLuminosidade);
    }

    public double getFatorLuminosidade() { return fatorLuminosidade; }
    public void setFatorLuminosidade(double fatorLuminosidade) { this.fatorLuminosidade = (fatorLuminosidade<0) ? 0 : fatorLuminosidade; }

    public double gastoMensal() {
        double gasto = getPotenciaEmUsoW() * getHorasUsoDiario() * 30 * getFatorLuminosidade();
        return gasto;
    }

    public String ligado() {
        if (getOnOff())
            return "Ligando lâmpada "+ getNome() +"...";
        else
            return "Desligando lâmpada "+ getNome() +"...";
    }

    public String consultarStatus() {
        if (getOnOff())
            return "A lâmpada"+ getNome() +" está ligada!";
        else
            return "A lâmpada "+ getNome() +" está desligada!";
    }

    public double gastoMensalPrevisto() {
        double gasto = getPotenciaMaximaW() * getHorasUsoDiario() * 30 * getFatorLuminosidade();
        return gasto;
    }
}
