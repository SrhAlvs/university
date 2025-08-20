package MMXXV_VIII_XIX;
import java.util.Scanner;

public class listaTresQuestaoQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Insira o raio do círculo: ");
        float raio = scanner.nextFloat();
        double areaCirculo = PI * raio * raio;

        System.out.println("Área do círculo: " + areaCirculo);
    }
}
