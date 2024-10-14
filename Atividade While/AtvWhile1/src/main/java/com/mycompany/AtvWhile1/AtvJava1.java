package com.mycompany.atvjavawhile;

import java.util.Scanner;

public class AtvJava1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos alunos tem na sala? ");
        int quantidadeAlunos = scanner.nextInt();
        
        int contador = 0;
        double somaNotas = 0;
        
        while (contador < quantidadeAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            contador++;
        }
        
        double media = somaNotas / quantidadeAlunos; 
        
        System.out.println("A média da turma é: " + media);
        
        scanner.close();
    }
}
