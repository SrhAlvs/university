package aula2025_09_30.lista11.questao04;

public class testeImovel {
    static void main() {
        Imovel i1 = new Imovel("Rua não sei, quadra 00", 50000);

        Novo n1 = new Novo("rua sei lá, quadra 01", 54000, 6000);
        n1.imprimirPreco();
        System.out.println("-------------------------------");

        Velho v1 = new Velho("rua não tenho ideia, quadra 02", 50000, 5000);
        v1.imprimirPreco();
    }
}
