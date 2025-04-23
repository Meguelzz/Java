package br.edu.etec.exerc1e2.io;

import br.edu.etec.exerc1e2.model.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Miguel");
        p1.setCpf("123.456.789-00");
        p1.setIdade(0);

        Pessoa p2 = new Pessoa();
        p2.setNome("Melissa");
        p2.setIdade(19);
        p2.setCpf("987.654.321-00");
    }
}
