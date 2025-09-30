package aula2025_09_23.lista10.questao01;

public class Funcionario {
    private String firstName;
    private String surname;
    private double salarioMensal;

    public Funcionario(String firstName, String surname, double salarioMensal){
        setFirstName(firstName);
        setSurname(surname);
        setSalarioMensal(salarioMensal);
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = (firstName == null) ? "" : firstName;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = (surname == null) ? "" : surname;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal < 0)
            this.salarioMensal = 0.0;
        else
            this.salarioMensal = salarioMensal;
    }

    public void exibirAtributos(){
        System.out.println("Primeiro nome: " + firstName);
        System.out.println("Sobrenome: " + surname);
        System.out.println("Salário mensal: " + salarioMensal);
    }
}
