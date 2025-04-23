/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.Pessoa.teste;

import br.edu.etec.Pessoa.model.Pessoa;

/**
 *
 * @author pedro
 */
public class Exerc_new1 {

    public static void main(String[] args) {
         Pessoa p1 =  new Pessoa();
        p1.setNome("Miguel");
        p1.setCpf("123.456.789-00");
        p1.setIdade(0);

        Pessoa p2 = new Pessoa();
        p2.setNome("Melissa");
        p2.setIdade(19);
        p2.setCpf("987.654.321-00");
    }
}
