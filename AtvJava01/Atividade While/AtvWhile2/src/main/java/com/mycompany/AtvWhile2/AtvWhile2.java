package com.mycompany.atvjavawhile2;

import java.util.Scanner;

public class ATVWhile2 {

    public static void main(String[] args) {
        
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu valor:  ");
        int N= scanner.nextInt();
        int contador=0;
        int soma=0;
        
        while(contador<N){
              
           soma +=N;
           contador++;

           System.out.println(": "+contador);
            
        }
           
        
             
    }
}
