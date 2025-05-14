package br.edu.etec.test;

import br.edu.etec.model.Computador;
import br.edu.etec.model.Equipamento;

public class Teste {
    public static void main(String[] args) {
        
        Equipamento equip = new Equipamento("Gabinete", "MicroATX");

        Computador comp = new Computador("PCGamer", "Pichau", "i7");

        equip.exibirDados();

        comp.exibirDados();

    }
}
