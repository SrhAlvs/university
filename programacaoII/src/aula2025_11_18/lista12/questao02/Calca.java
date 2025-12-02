package aula2025_11_18.lista12.questao02;

public class Calca extends Produto {
    private String tamanho, material;

    public Calca(
            String descricao,
            double precoCusto,
            String tamanho,
            String material) {
        super(descricao, precoCusto);
        setTamanho(tamanho);
        setMaterial(material);
    }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = (tamanho == null) ? "--não informado--" : tamanho; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = (material == null) ? "--não informado--" : material; }

    @Override
    public double calcularPrecoVenda() {
        double margemLucro = 0.30;
        double precoVenda = getPrecoCusto() + (getPrecoCusto() * margemLucro);

        if (getMaterial().equalsIgnoreCase("Couro")) {
            precoVenda += 20.00;
        }

        return precoVenda;
    }
}
