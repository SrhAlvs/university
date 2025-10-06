package aula2025_09_23.lista10.questao05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public Data() {
        Calendar hoje = new GregorianCalendar();

        this.ano = hoje.get(Calendar.YEAR);
        this.mes = hoje.get(Calendar.MONTH) + 1;
        this.dia = hoje.get(Calendar.DAY_OF_MONTH);
    }

    public int getAno() { return ano;}
    public void setAno(int ano) {
        if (ano >= 1 && ano <= 2025)
            this.ano = ano;
    }

    public int getMes() { return mes;}
    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12)
            this.mes = mes;
    }

    public int diaMaximo () {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                //ano bissexto
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default: //mês 1, 3, 5, 7, 8, 10, 12
                return 31;
        }
    }

    public int getDia() { return dia;}
    public void setDia(int dia) {
        if (dia >= 1 && dia <= diaMaximo())
            this.dia = dia;
    }

    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }

    public String diaSeguite () {
        this.dia++;
        if (dia > diaMaximo()) {
            this.dia = 1;
            this.mes++;
            if (mes > 12) {
                this.mes = 1;
                this.ano++;
            }
        }
        return toString();
    }
}
