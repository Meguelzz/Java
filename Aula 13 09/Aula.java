/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import static java.awt.PageAttributes.MediaType.D;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Aula {

    public static void main(String[] args) { {
        System.out.println("Hello World!");
//ENTRADA//
    Scanner scanner = new Scanner(System.in);
    int idade;

    System.out.println("----- Programa de comparação maior idade-----");
    System.out.println("Digite a idade");
    idade=scanner.nextInt();
            
//PROCESSAMENTO//
    if(idade >= 18) {
        System.out.println("Aluno maior de idade");
}else{

        System.out.println("Aluno menor de idade");
        }
    
//SAÍDA//
    System.out.println("***Treinamentoo de estrutura lógica***");
    System.out.println(" O valor de D será:" +D);
            }
    }
}
