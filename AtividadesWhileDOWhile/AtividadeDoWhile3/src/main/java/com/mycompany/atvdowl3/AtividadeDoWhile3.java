package com.mycompany.atvdowl3;

import java.util.Scanner;

public class AtividadeDoWhile3 {

    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner scanner= new Scanner(System.in);
        int N=scanner.nextInt();
        
         do{
             System.out.println(N--);
         }
        while(N!=0);
        
       scanner.close();
        
    }
}
