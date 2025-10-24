package prova2025_10_21;

public class Drone {
    private int codigo;
    private String modelo;
    protected double pesoMaximo;
    protected double autonomiaKm;
    private double velocidadeMedia;
    protected int bateriaAtual;

    public Drone(int codigo, int bateriaAtual, String modelo, double pesoMaximo, double autonomiaKm, double velocidadeMedia) {
        setCodigo(codigo);
        setBateriaAtual(bateriaAtual);
        setModelo(modelo);
        setPesoMaximo(pesoMaximo);
        setAutonomiaKm(autonomiaKm);
        setVelocidadeMedia(velocidadeMedia);
    }

    public int getCodigo() { return this.codigo; }
    public void setCodigo(int codigo) { this.codigo = (codigo < 0) ? 0 : codigo; }

    public int getBateriaAtual() { return this.bateriaAtual; }
    public void setBateriaAtual(int bateriaAtual) { this.bateriaAtual = (bateriaAtual < 0 || bateriaAtual > 100) ? 0 : bateriaAtual; }

    public String getModelo() { return this.modelo; }
    public void setModelo(String modelo) { this.modelo = (modelo == null) ? "" : modelo; }

    public double getPesoMaximo() { return this.pesoMaximo; }
    public void setPesoMaximo(double pesoMaximo) { this.pesoMaximo = (pesoMaximo < 0) ? 0 : pesoMaximo; }

    public double getAutonomiaKm() { return this.autonomiaKm; }
    public void setAutonomiaKm(double autonomiaKm) { this.autonomiaKm = (autonomiaKm < 0) ? 0 : autonomiaKm; }

    public double getVelocidadeMedia() { return this.velocidadeMedia; }
    public void setVelocidadeMedia(double velocidadeMedia) { this.velocidadeMedia = (velocidadeMedia < 0) ? 0 : velocidadeMedia; }

    public double calcularTempoEstimado(double distanciaKm) {
        double tempo;
        tempo = distanciaKm/velocidadeMedia;
        if (distanciaKm > autonomiaKm)
            tempo = -1;
        return tempo;
    }

    public void exibirTempoEstimado(double distanciaKm) {
        double resultadoTempo = calcularTempoEstimado(distanciaKm);
        System.out.println("Tempo estimado (horas): " + ((resultadoTempo == -1) ? "INVIÁVEL" : resultadoTempo));
    }

    public void exibirResumo() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Peso máximo (Kg): " + ((getPesoMaximo()==0) ? "NÃO INFORMADO" : getPesoMaximo()));
        System.out.println("Autonomia (km): " + ((getAutonomiaKm()==0) ? "NÃO INFORMADO" : getAutonomiaKm()));
        System.out.println("Velocidade média (km/h): " + ((getVelocidadeMedia()==0) ? "NÃO INFORMADO" : getVelocidadeMedia()));
        System.out.println("Bateria atual: " + ((getBateriaAtual()==0) ? "NÃO INFORMADO" : getBateriaAtual()));

    }
}
