package MMXXV_VIII_XIX;

import java.util.Scanner;

public class listaCincoQuestaoTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor total da compra: ");
        double valorTotal = scanner.nextDouble();

        String status;
        int pontos;
        int valorInt = (int) valorTotal;

        if (valorTotal <= 500) {
            status = "Bronze";
            pontos = valorInt/10;
            if (pontos > 40) {
                status = "Bronze Plus";
            }
        } else if (valorTotal > 500 && valorTotal <= 1000) {
            status = "Prata";
            pontos = valorInt/8;
        } else if (valorTotal > 1000 && valorTotal <= 5000) {
            status = "Ouro";
            pontos = valorInt/5;
        } else {
            status = "Diamante";
            pontos = valorInt/2;
            if (pontos > 5000) {
                status = "Cliente VIP Diamante";
            }
        }
        System.out.println("Status do cliente: " + status);
        System.out.println("Pontos adquiridos: " + pontos);
    }
}
