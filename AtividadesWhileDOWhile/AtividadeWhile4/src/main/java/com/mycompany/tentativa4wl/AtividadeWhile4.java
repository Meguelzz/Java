package com.mycompany.AtividadeWhile4;

import java.util.Scanner;

class AtividadeWhile4 {

    public static void main(String[] args) {
     
        Scanner scanner= new Scanner(System.in);
        System.out.print("DIgite um numero:  ");
        int N= scanner.nextInt();
        int par=0;
        int impar=0;
        int numeroinicial=1; 
        
        while(numeroinicial <=N){
            
            if(numeroinicial % 2== 0){ 
                
            par++;  
            }
            else { 
               impar++; 
               
               
             }
           numeroinicial++; 
        
         System.out.println("Numeros pares:"+par);
         System.out.println("Numeros impares:"+impar);
         scanner.close();
    }
}
