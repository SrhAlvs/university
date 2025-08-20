package MMXXV_VIII_XIX;
import java.util.Scanner;

public class listaDoisQuestaoUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Qual o valor do seu salário mensal? ");
        float salarioMensal = scanner.nextFloat();

        System.out.print("Insira uma letra do alfabeto: ");
        String letra = scanner.next();
        //pesquisei e vi que poderia fazer da forma a seguir
        //char letra =  scanner.next().charAt(0);
        //mas preferi fazer do jeito que tinha no material do Moodle

        String fraseBoasVindas = "Seja bem vind@!";
        System.out.println(fraseBoasVindas);

        System.out.print("Insira um número qualquer: ");
        float num = scanner.nextFloat();

        boolean ehPar = false;

        if (num % 2 == 0) {
            ehPar = true;
        }

        if (ehPar == true) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
    }
}
