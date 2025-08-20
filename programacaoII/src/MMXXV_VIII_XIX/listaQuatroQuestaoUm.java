package MMXXV_VIII_XIX;
import java.util.Scanner;

public class listaQuatroQuestaoUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um valor inteiro: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }
}
