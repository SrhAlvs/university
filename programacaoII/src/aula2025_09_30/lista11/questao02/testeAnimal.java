package aula2025_09_30.lista11.questao02;

import aula2025_09_30.lista11.questao03.Peixe;

public class testeAnimal {
    static void main() {
        Animal panda = new Animal("Panda", 7, 1, "bambu", 25);
        panda.mostrarNome();
        panda.comer();
        panda.mostrarIdade();
        panda.mover();
        dividirEscopo();

        Canino raposa = new Canino("Raposa", 5, 3, "pequenos roedores, frutas, insetos", 50, "florestas");
        raposa.mostrarNome();
        raposa.comer();
        raposa.mostrarIdade();
        raposa.mover();
        dividirEscopo();

        Cachorro dalmata = new Cachorro("Dálmata", 20, 4, "ração", 60, "mds, sla, doméstico?");
        dalmata.mostrarNome();
        dalmata.comer();
        dalmata.mostrarIdade();
        dalmata.mover();
        dalmata.alimentar();
        dalmata.latir();
        dividirEscopo();

        Lobo l1 = new Lobo("Lobo", 40, 5, "carne", 60, "tundras");
        l1.mostrarNome();
        l1.comer();
        l1.mostrarIdade();
        l1.mover();
        l1.uivar();
        dividirEscopo();

        Felino jaguatirica = new Felino("Jaguatirica", 12, 4, "pequenos mamíferos", 65);
        jaguatirica.mostrarNome();
        jaguatirica.comer();
        jaguatirica.mostrarIdade();
        jaguatirica.mover();
        jaguatirica.ronronar();
        dividirEscopo();

        Gato scottishFold = new Gato("Gato", 4.5, 2, "ração", 45, "Scottish Fold");
        scottishFold.mostrarNome();
        scottishFold.comer();
        scottishFold.mostrarIdade();
        scottishFold.mover();
        scottishFold.ronronar();
        scottishFold.miar();
        dividirEscopo();

        Onca oncaPintada = new Onca("Onça pintada", 96, 8, "capivaras muahahhah", 80);
        oncaPintada.mostrarNome();
        oncaPintada.comer();
        oncaPintada.mostrarIdade();
        oncaPintada.mover();
        oncaPintada.ronronar();
        oncaPintada.rosnar();
        dividirEscopo();

        Peixe salmao = new Peixe("Salmão", 4, 3, "peixes menores, invertebrados", 10, "Anádromo (peixes que vivem a maior parte de suas vidas no oceano, mas migram para a água doce para se reproduzir)");
        salmao.dadosDoPeixe();
    }

    public static void dividirEscopo() {
        System.out.print("\n------------------------------------------------\n\n");
    }
}
