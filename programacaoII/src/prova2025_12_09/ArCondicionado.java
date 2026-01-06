package prova2025_12_09;

public class ArCondicionado extends DispositivoEletronico implements Operavel {
    public ArCondicionado(String nome, double potenciaMaximaW, double potenciaEmUsoW, double horasUsoDiario, boolean onOff) {
        super(nome, potenciaMaximaW, potenciaEmUsoW, horasUsoDiario, onOff);
    }

    public double gastoMensal() {
        double gasto = getPotenciaEmUsoW() * getHorasUsoDiario() * 30 * 0.85;
        // dias em um mês = 30, fator de eficiência = 0.85
        return gasto;
    }

    public String ligado() {
        if (getOnOff())
            return "Ligando ar condicionado "+ getNome() +"...";
        else
            return "Desligando ar condicionado "+ getNome() +"...";
    }

    public String consultarStatus() {
        if (getOnOff())
            return "O ar condicionado"+ getNome() +" está ligado!";
        else
            return "O ar condicionado "+ getNome() +" está desligado!";
    }

    public double gastoMensalPrevisto() {
        double gasto = getPotenciaMaximaW() * getHorasUsoDiario() * 30 * 0.85;
        // dias em um mês = 30, fator de eficiência = 0.85
        return gasto;
    }
}
