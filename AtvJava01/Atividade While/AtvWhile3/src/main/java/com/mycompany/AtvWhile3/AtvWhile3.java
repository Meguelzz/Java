package com.mycompany.atvjavawhile3;

import java.util.Scanner;

public class ATVWhile3 {

    public static void main(String[] args) {
      int maior=0;
      int Segmaior=0;
      
      Scanner scanner= new Scanner(System.in);
     
      int  contador=0;

      System.out.println("Digite 10 numeros: ");
      
      int W;
      
      while(contador<10){//limite
          
         W=scanner.nextInt();
         
         
           if (W > maior) {
               
        Segmaior = maior;
        
        maior = W; 
    } 
   
    else if (W> Segmaior) { 
        
        Segmaior=maior;
        
        maior = W;  
    }
    
        contador++;
      }
       System.out.println("Maior: " + maior);
       
        System.out.println("Segundo maior: " + Segmaior);
    }
}
