package com.mycompany.tentativawl2;

import java.util.Scanner;

public class AtividadeWhile2 {

    public static void main(String[] args) {
          
        Scanner scanner = new Scanner (System.in);
        
   
       System.out.print("Digite um numero: ");
       int contador=1;
        int nu= scanner.nextInt();
        
        while(contador<=10){
            int resultado= nu*contador;
            System.out.println( nu+"X"+contador+"="+resultado+"."); 
            contador++;
        }
        
        scanner.close(); 
        
        
        
        
        
        
    } 
        
}
