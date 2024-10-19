package com.mycompany.do3;
import java.util.Scanner;

public class Atv3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Contador=0;
        int Numero;
        
       do {
           System.out.print("Digite um número inteiro: ");
           Numero = scanner.nextInt();
           
           if (Numero != 0) {
               Contador++;
               System.out.println("Você inseriu: " +Contador+ " números.");   
            }
        

       }while (Numero !=0); 
       
       System.out.println("Você inseriu: " +Contador+ " números.");
       scanner.close();
        
       
           }
           
       }
      
    

