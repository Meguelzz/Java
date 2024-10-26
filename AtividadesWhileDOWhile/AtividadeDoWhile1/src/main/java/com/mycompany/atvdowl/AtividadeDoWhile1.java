package com.mycompany.atvdowl;

import java.util.Scanner;

public class AtividadeDoWhile1 {

    public static void main(String[] args) {
      
        Scanner scanner= new Scanner(System.in);
       System.out.println("------MEU MENU------");
       System.out.println("Digite um numero respectivo a uma das opçoes seguintes: ");
        System.out.print("1.Adicionar  2.Remover  3.Sair: ");
    
        int N= scanner.nextInt();
    
     do{
      
         System.out.println("O numero digitado foi: "+N);
          System.out.print("Digite outro numero por favor:  ");
            N= scanner.nextInt(); 
        }
     while(N !=3);
     
         
     
   
     
     System.out.print("Voce digitou 3, fim da sequencia");
     
     scanner.close();
   }
}

