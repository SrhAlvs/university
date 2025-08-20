package MMXXV_VIII_XIX;
import java.util.Scanner;

public class listaTresQuestaoCinco {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Insira um valor em horas: ");
        int horas = scanner.nextInt();
        int minutos = horas*60;
        int segundos = minutos*60;
        System.out.println("Tempo em minutos: " + minutos);
        System.out.println("Tempo em segundos: " + segundos);
    }
}
