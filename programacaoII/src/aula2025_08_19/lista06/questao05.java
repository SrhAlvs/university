package aula2025_08_19.lista06;

public class questao05 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i<=100; i++) {
            if (i%2 != 0) {
                soma += i;
            }
        }
        System.out.println("Soma dos números entre 1 e 100 (inclusos): " + soma);
    }
}
