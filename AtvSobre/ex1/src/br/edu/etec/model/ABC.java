package br.edu.etec.model;

public class ABC extends Fun {

    public ABC(String nome, double salario, int anoAdmissao) {
        super(nome, salario, anoAdmissao);
    }

    @Override
    public double calcularPL(int anoAt) {
        return (anoAt - anoAdmissao >= 5) ? salario * 5 : 0;
    }
}