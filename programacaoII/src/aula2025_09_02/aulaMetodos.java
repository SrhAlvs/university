package aula2025_09_02;

public class aulaMetodos {
    public static void main(String[] args) {
        int resultado = somar(5, 3);

        System.out.println("Resultado: " + resultado);
        System.out.println("Resultado de 8 + 9: " + somar(8, 9));
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}
