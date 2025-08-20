package MMXXV_VIII_XIX;
import java.util.Scanner;

public class listaTresQuestaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira uma temperatura em Celcius (ºC): ");
        float temperatura = scanner.nextFloat();
        double conversaoCParaF = temperatura * 1.8 + 32;
        System.out.println("A temperatura " + temperatura + "ºC corresponde a " + conversaoCParaF + "F.");
    }
}
