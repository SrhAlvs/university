package MMXXV_VIII_XIX;
import java.util.Scanner;

public class listaCincoQuestaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um dia, mês e ano (dd mm aaaa): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int ano = scanner.nextInt();

        boolean dataValida = true;
        boolean anoBissexto = false;
        int diaMaximoDoMes = 0;

        if (ano<0 || ano>10000) {
            dataValida = false;
        }

        if (dataValida) {
            if ((mes<1) || (mes>12)) {
                dataValida = false;
            }
        }

        if (dataValida) {
            if ((((ano % 4) == 0) && ((ano % 100) != 0)) || ((ano % 400) == 0)) {
                anoBissexto = true;
            }
        }

        if (dataValida) {
            if (mes==4 || mes==6 || mes==9 || mes==11) {
                diaMaximoDoMes = 30;
            } else if (mes==2) {
                if (anoBissexto) {
                    diaMaximoDoMes = 29;
                } else {
                    diaMaximoDoMes = 28;
                }
            } else {
                diaMaximoDoMes = 31;
            }

            if (dia<1 || dia>diaMaximoDoMes) {
                dataValida = false;
            }
        }

        if (dataValida) {
            System.out.println("Data válida");

            if (anoBissexto) {
                System.out.println("O ano é bissexto");
            } else {
                System.out.println("O ano não é bissexto");
            }
        } else {
            System.out.println("Data inválida");
        }
    }
}
