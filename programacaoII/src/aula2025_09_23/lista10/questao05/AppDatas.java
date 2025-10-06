package aula2025_09_23.lista10.questao05;

public class AppDatas {
    static void main() {
        Data d1 = new Data(12, 6, 2006);
        Data d2 = new Data(31, 12, 1970);
        Data d3 = new Data(31, 7, 2025);

        System.out.println(d1);
        System.out.println(d2.diaSeguite());
        System.out.println(d3.diaSeguite());
        System.out.println(new Data());
    }
}
