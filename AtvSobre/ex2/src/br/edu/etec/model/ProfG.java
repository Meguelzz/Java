package br.edu.etec.model;

public class ProfG {
    protected String nome;

    public ProfG(String nome) {
        this.nome = nome;
    }

    public double salario(double bruto, int disciplinas) {
        double adicional = disciplinas * 50.0;
        double desconto = bruto * 0.20;
        return bruto - desconto + adicional;
    }
}