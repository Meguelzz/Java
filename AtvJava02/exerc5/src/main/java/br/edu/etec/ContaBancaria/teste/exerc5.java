/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.ContaBancaria.teste;

import br.edu.teste.ContaBancaria.model.ContaBancaria;

/**
 *
 * @author madpais
 */
public class exerc5 {

    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();
        cb.saldo = 100.00;
        cb.sacar(150.00);  //o saldo está como private....alterar para public para testar!!!
        
    }
}
