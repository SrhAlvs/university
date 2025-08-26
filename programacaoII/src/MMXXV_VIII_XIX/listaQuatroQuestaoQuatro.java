package MMXXV_VIII_XIX;
import java.util.Scanner;

public class listaQuatroQuestaoQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira uma nota de 0 a 10: ");
        float nota = scanner.nextFloat();
        if ((nota >= 7) && (nota <= 10)) {
            System.out.println("Aprovado");
        } else if ((nota >= 5) && (nota <= 6.9)) {
            System.out.println("Recuperação");
        } else if ((nota < 5) && (nota >= 0)) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Nota inválida");
        }
    }
}
