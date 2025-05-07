package br.edu.etec.exerc2.model;

import java.util.Scanner;

public class Meses {
    public enum Mes {
        Janeiro(1),
        Fevereiro(2),
        Março(3),
        Abril (4),
        Maio(5),
        Junho(6),
        Julho(7),
        Agosto(8),
        Setembro(9),
        Outubro(10),
        Novembro(11),
        Dezembro(12);

        Mes(int numero){
            this.numero = numero;
        }

        private int numero;

        public int getNumero() {
            return this.numero;
        }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número (1-12): ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 12) {
            Mes mes = Mes.values() [numero - 1];
            System.out.println("Mês: " + mes);
        }
        else {
            System.out.println("Mês " + numero + " inválido");
        }
    }
}