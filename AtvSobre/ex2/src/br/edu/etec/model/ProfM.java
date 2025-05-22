package br.edu.etec.model;

public class ProfM extends ProfG {

    public ProfM(String nome) {
        super(nome);
    }

    public double salario(double bruto, int disciplinas, int artigos) {
        double adicional = disciplinas * 50.0 + artigos * 150.0;
        double desconto = bruto * 0.20;
        return bruto - desconto + adicional;
    }
}