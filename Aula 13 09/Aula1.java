package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Aula1 {

    public static void main(String[] args) {

        // ENTRADA
        Scanner scanner = new Scanner(System.in);
        
        int idade;
        
        System.out.println("--- Programa de comparação maior idade ---");
        System.out.print("Digite a idade: ");
        idade = scanner.nextInt();
        
        // PROCESSAMENTO
        if (idade >= 18) {
            System.out.println("Aluno maior de idade");
        } else {
            System.out.println("Aluno menor de idade");
        }
        
        // Fechando o scanner
        scanner.close();
    }
}