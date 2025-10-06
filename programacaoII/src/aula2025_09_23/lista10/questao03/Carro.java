package aula2025_09_23.lista10.questao03;

public class Carro {
    private String modelo, cor, ano, marca, chassi, proprietario;
    private int velocidadeMaxima, velocidadeAtual, numPortas, numMarchas, marchaAtual;
    private double volCombustivel, autonomia;
    private boolean tetoSolar, cambioAutomatico;

    public Carro(double autonomia, int nMarchas, double volCombustivel) {
        setAutonomia(autonomia);
        setNumMarchas(numMarchas);
        setVolCombustivel(volCombustivel);
        setMarchaAtual(marchaAtual);
        this.modelo = "";
        this.cor = "";
        this.ano = "";
        this.marca = "";
        this.chassi = "";
        this.proprietario = "";
        this.velocidadeMaxima = 0;
        this.velocidadeAtual = 0;
        this.numPortas = 2;
        this.tetoSolar = false;
        this.cambioAutomatico = false;
    }

    public double getAutonomia() { return autonomia; }
    public void setAutonomia(double autonomia) { this.autonomia = (autonomia > 0) ? autonomia : 0; }

    public int getNumMarchas() { return numMarchas; }
    public void setNumMarchas(int numMarchas) {
        if (numMarchas >= 5 && numMarchas <= 10) {
            this.numMarchas = numMarchas;
        } else {
            this.numMarchas = 0;
        }
    }

    public int getMarchaAtual() { return marchaAtual; }
    public void setMarchaAtual(int marchaAtual) {
        if (marchaAtual >= numMarchas && marchaAtual <= -1) {
            this.marchaAtual = marchaAtual;
        } else {
            this.marchaAtual = 0;
        }
    }

    public double getVolCombustivel() { return volCombustivel; }
    public void setVolCombustivel(double volCombustivel) {
        if (volCombustivel >= 0.0 && numMarchas <= 60.0) {
            this.volCombustivel = volCombustivel;
        } else {
            this.volCombustivel = 0;
        }
    }

    public int acelerar() {
        this.velocidadeAtual += 1;
        return this.velocidadeAtual;
    }

    public int freiar() {
        this.velocidadeAtual = 0;
        return this.velocidadeAtual;
    }

    public int trocarDeMarcha() {
        this.marchaAtual += 1;
        return this.marchaAtual;
    }

    public int reduzirMarcha() {
        this.marchaAtual -= 1;
        return this.marchaAtual;
    }

    public double kmPorLitro(double distancia) {
        if (this.autonomia <= 0) {
            System.out.println("Erro: A autonomia do carro não está definida (ou é zero/negativa).");
            return 0.0;
        }

        if (distancia <= 0) {
            return 0.0;
        }

        return distancia/this.autonomia;
    }

    public void exibirAtributos() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Marca: " + marca);
        System.out.println("Chassi: " + chassi);
        System.out.println("Proprietário: " + proprietario);
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        System.out.println("Número de portas: " + numPortas);

        String msgTetoSolar = tetoSolar ? "possui" : "não possui";
        System.out.println("Teto solar: " + msgTetoSolar);

        System.out.println("Número de marchas: " + numMarchas);

        String msgCambioAutomatico = cambioAutomatico ? "possui" : "não possui";
        System.out.println("Cambio automático: " + msgCambioAutomatico);

        System.out.println("Volume de combustível: " + volCombustivel);
        System.out.println("Autonomia: " + autonomia);
    }
}
