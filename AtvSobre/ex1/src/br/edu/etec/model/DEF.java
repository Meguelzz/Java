package br.edu.etec.model;

public class DEF extends Fun {

    public DEF(String nome, double salario, int anoAdmissao) {
        super(nome, salario, anoAdmissao);
    }

    @Override
    public double calcularPL(int anoAt) {
        return (anoAt - anoAdmissao >= 5) ? salario * 3 : 0;
    }
}