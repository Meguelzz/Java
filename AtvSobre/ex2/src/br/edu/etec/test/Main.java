package br.edu.etec.test;

import br.edu.etec.model.ProfG;
import br.edu.etec.model.ProfM;


public class Main {
    public static void main(String[] args) {
        ProfG prof1 = new ProfG("Robert");
        ProfM prof2 = new ProfM("Kelly");

        double salarioRobert = prof1.salario(25000.0, 4);
        double salarioKelly = prof2.salario(25000.0, 3, 2);

        System.out.println("Salário líquido de Robert (Graduação): R$ " + salarioRobert);
        System.out.println("Salário líquido de Kelly (Mestrado): R$ " + salarioKelly);
    }
}