/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ConfiguracaoSistema.teste;

import br.edu.etec.ConfiguracaoSistema.model.ConfiguracaoSistema;

/**
 *
 * @author pedro
 */
public class SubSistema extends ConfiguracaoSistema {
    public void exibirInfo(){
        System.out.println("Versao: " + this.versaoSistema);
    }
}
