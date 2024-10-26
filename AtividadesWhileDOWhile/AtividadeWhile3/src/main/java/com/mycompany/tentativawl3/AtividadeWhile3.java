package com.mycompany.AtividadeWhile3;

import java.util.Scanner;

public class AtividadeWhile3 {

    public static void main(String[] args) {
      
        
        Scanner scanner= new Scanner(System.in); 
        
        System.out.println("Adivinhe um numero entre 1 e 100: ");
        
        int tentativa=scanner.nextInt();
        
        int tentativacerta=33;
        
        int contador=1;
        
        while(tentativa !=tentativacerta){
               
            
            if(tentativa >33){
            
                System.out.println("Numero muito alto! Tente  novamente");
                
                tentativa=scanner.nextInt(); 
             }
             
              if(tentativa <33)  { 
                  
                  System.out.println("Numero muito BAIXO! Tente  novamente");
               
                  tentativa=scanner.nextInt(); 
              }
              
            
              contador++; 
              
    }
        
        
        System.out.println("Voce acertou! O numero era 33!"); 
        
        System.out.print("Voce tentou: "+contador+" vezes");

    scanner.close();
    }
}
