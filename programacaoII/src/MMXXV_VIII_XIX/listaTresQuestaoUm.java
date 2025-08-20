package MMXXV_VIII_XIX;
import java.util.Scanner;

public class listaTresQuestaoUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira 2 números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.println(soma);
    }
}
