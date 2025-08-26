package MMXXV_VIII_XIX;
import java.util.Scanner;

public class listaQuatroQuestaoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um ano: ");
        int ano = scanner.nextInt();
        if ((((ano%4)==0) && ((ano%100)!=0)) || (((ano%400)== 0))) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Não é um ano bissexto");
        }
    }
}
