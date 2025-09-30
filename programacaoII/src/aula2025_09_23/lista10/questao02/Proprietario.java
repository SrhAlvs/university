package aula2025_09_23.lista10.questao02;

public class Proprietario {
    private String nome, cpf, rg, telefone, rua, bairro, cidade, estado, cep, complemento;
    private int anoNascimento, mesNascimento, diaNascimento;

    public Proprietario(String nome, String cpf, String rg) {
        setNome(nome);
        setCpf(cpf);
        setRg(rg);
        this.telefone = "";
        this.rua = "";
        this.bairro = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.complemento = "";
        this.diaNascimento = 0;
        this.mesNascimento = 0;
        this.anoNascimento = 0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) { this.nome = (nome == null) ? "" : nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = (cpf.length() != 11) ? "0" : cpf; }

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) { this.rg = (rg == null) ? "" : rg; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public void setDataNascimento(int dia, int mes, int ano) {
        if (ano > 1900 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
            this.diaNascimento = dia;
            this.mesNascimento = mes;
            this.anoNascimento = ano;
        } else {
            this.diaNascimento = 0;
            this.mesNascimento = 0;
            this.anoNascimento = 0;
        }
    }

    public int calcularIdade() {
        if ((this.anoNascimento!=0) && (this.mesNascimento!=0) && (this.diaNascimento!=0)) {
            int anoAtual = 2025;
            int mesAtual = 9; // Mês é base-0, então somamos 1
            int diaAtual = 30;

            int idade = anoAtual - this.anoNascimento;

            if (mesAtual < this.mesNascimento || (mesAtual == this.mesNascimento && diaAtual < this.diaNascimento))
                idade--;

            return idade;
        } else {
            return 0;
        }
    }

    public void exibirAtributos(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);

        String dataNasc = (anoNascimento != 0) ? diaNascimento + "/" + mesNascimento + "/" + anoNascimento : "Não informada";
        System.out.println("Data Nasc.: " + dataNasc);
        System.out.println("Idade: " + (calcularIdade() == 0 ? "N/A" : calcularIdade() + " anos"));

        System.out.println("Telefone: " + telefone);
        System.out.println("Rua: " + rua);
        System.out.println("Bairro: " + bairro);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Complemento: " + complemento);

        System.out.println();
    }
}
