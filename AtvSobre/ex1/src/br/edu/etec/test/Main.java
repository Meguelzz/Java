package br.edu.etec.test;

import br.edu.etec.model.ABC;
import br.edu.etec.model.DEF;
import br.edu.etec.model.Fun;
import br.edu.etec.model.GHI;

public class Main {
    public static void main(String[] args) {
        Fun f1 = new ABC("Maria", 2075.0, 2015);
        Fun f2 = new DEF("João", 2508.0, 2022);
        Fun f3 = new GHI("Pedro", 1644.0, 2018);

        int anoAt = 2025;

        System.out.println("Maria (ABC): R$ " + f1.calcularPL(anoAt));
        System.out.println("João (DEF): R$ " + f2.calcularPL(anoAt));
        System.out.println("Pedro (GHI): R$ " + f3.calcularPL(anoAt));
    }
}