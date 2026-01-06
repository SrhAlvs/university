package prova2025_12_09;

public class Geladeira extends DispositivoEletronico implements Operavel {
    public Geladeira(String nome, double potenciaMaximaW, double potenciaEmUsoW, double horasUsoDiario, boolean onOff) {
        super(nome, potenciaMaximaW, potenciaEmUsoW, horasUsoDiario, onOff);
    }

    public double gastoMensal() {
        double gasto;

        if (getOnOff()) {
            gasto = getPotenciaEmUsoW() * 24 * 30;
        } else {
            gasto = getPotenciaEmUsoW() * 20 * 30 * 0.3;
        }

        return gasto;
    }

    public String ligado() {
        if (getOnOff())
            return "Ligando geladeira "+ getNome() +"...";
        else
            return "Desligando geladeira "+ getNome() +"...";
    }

    public String consultarStatus() {
        if (getOnOff())
            return "A geladeira"+ getNome() +" está ligada!";
        else
            return "A geladeira "+ getNome() +" está desligada!";
    }

    public double gastoMensalPrevisto() {
        double gasto;

        if (getOnOff()) {
            gasto = getPotenciaMaximaW() * 24 * 30;
        } else {
            gasto = getPotenciaMaximaW() * 20 * 30 * 0.3;
        }

        return gasto;
    }
}
