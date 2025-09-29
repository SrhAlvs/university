package aula2025_08_19.lista02;

public class questao04 {
    public static void main(String[] args) {
        //CONVERSÃO EXPLÍCITA (COM CASTING)
        double varA = 1.666;
        int varB = (int) varA;
        System.out.println(varA); //1.666
        System.out.println(varB); //1
        //como visto no código, a parte decimal da variável varA é "perdida" quando convertemos ela para inteiro e guardamos ela dentro da variável varB
        //porque a variável varA era de um tipo maior que a variável varB
        //por causa disso, perdemos a exatidão no código

        //CONVERSÃO AUTOMÁTICA (SEM CASTING)
        int varC = 12;
        double varD = varC;
        System.out.println(varC); //12
        System.out.println(varD); //12.0
        //esse tipo de conversão é considerado seguro porque estamos convertendo uma variável com tipo menor para um tipo maior
        //por conta disso, o valor da variável é preservado integralmente
    }
}
