package aula2025_08_19.lista05;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Possui algum problema cardíaco? (S/N): ");
        char problemaCardiaco = scanner.next().charAt(0);

        System.out.print("Tempo disponível em minutos: ");
        int tempoDisponivel = scanner.nextInt();

        String exercicioRecomendado = "";
        if (idade <= 18) {
           if (problemaCardiaco == 'N') {
               if (tempoDisponivel >= 30 && tempoDisponivel < 60) {
                   exercicioRecomendado = "Corrida";
               } else if (tempoDisponivel >= 60) {
                   exercicioRecomendado = "Natação ou Futebol";
               }
           } else {
               exercicioRecomendado = "Caminhada moderada";
           }
        } else if (idade < 60) {
            if (problemaCardiaco == 'N') {
                if (tempoDisponivel >= 30 && tempoDisponivel < 60) {
                    exercicioRecomendado = "Circuito funcional";
                } else if (tempoDisponivel >= 60) {
                    exercicioRecomendado = "Musculação + Aeróbico";
                } else {
                    exercicioRecomendado = "Alongamento";
                }
            } else {
                exercicioRecomendado = "Caminhada leve";
            }
        } else {
            if (problemaCardiaco == 'N') {
                exercicioRecomendado = "Caminhada e alongamentos supervisionados";
            } else {
                exercicioRecomendado = "Alongamento e exercícios de fisioterapia";
            }
        }

        System.out.println("Tipo de exercício recomendado: " + exercicioRecomendado);
        scanner.close();
    }
}