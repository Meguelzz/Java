package br.edu.etec.exerc1.model;

import java.util.Scanner;

public class Dias {
    public enum DiaSemana {
        Domingo,
        Segunda,
        Terça,
        Quarta,
        Quinta,
        Sexta,
        Sábado
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número (1-7): ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 7) {
            DiaSemana dia = DiaSemana.values() [numero];
            System.out.println("Dia da Semana: " + dia);
        }
        else {
            System.out.println("Número " + numero + " inválido");
        }
    }
}