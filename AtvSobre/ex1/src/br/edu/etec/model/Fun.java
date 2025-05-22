package br.edu.etec.model;

public class Fun {
    protected String nome;
    protected double salario;
    protected int anoAdmissao;

    public Fun(String nome, double salario, int anoAdmissao) {
        this.nome = nome;
        this.salario = salario;
        this.anoAdmissao = anoAdmissao;
    }

    public double calcularPL(int anoAt) {
        if (anoAt - anoAdmissao < 5) {
            return 0.0;
        }
        return 0.0;
    }
}