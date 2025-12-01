package aula2025_11_18.lista12.questao01;

public abstract class Funcionario {
    private String nome;
    private long cpf;
    private double salarioBase;

    public Funcionario(String nome, long cpf, double salarioBase) {
        setNome(nome);
        setCpf(cpf);
        setSalarioBase(salarioBase);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = (nome == null) ? "--não informado--" : nome; }

    public long getCpf() { return cpf; }
    public void setCpf(long cpf) { //this.cpf = (cpf < 0) ? 0 : cpf;
        int contador = 1;
        long cpfRecebido = cpf;
        while (cpfRecebido > 9) {
            cpfRecebido = cpfRecebido/10;
            contador++;
        }
        if (contador != 11) {
            System.out.println("Erro: CPF ("+getNome()+") deve ter 11 dígitos. Valor ignorado.\n");
            this.cpf = 0;
        } else {
            this.cpf = cpf;
        }
    }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = (salarioBase < 0) ? 0 : salarioBase; }

    public abstract double calcularSalario();

    public void imprimirDados() {
        System.out.println("------- INFORMAÇÕES DO USUÁRIO -------");
        System.out.println("Nome: " + getNome());

        if (getCpf() == 0) {
            System.out.println("CPF ("+getNome()+"): --não informado ou inválido--");
        } else {
            // Transforma o número em texto, garantindo que tenha 11 dígitos (preenche com zeros à esquerda se precisar)
            String cpfTexto = String.format("%011d", getCpf());
            String cpfFormatado = cpfTexto.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
            System.out.println("CPF: " + cpfFormatado);
        }

        System.out.println("Salário base: " + ((getSalarioBase() == 0) ? "--não informado--" : getSalarioBase()));
    }
}
