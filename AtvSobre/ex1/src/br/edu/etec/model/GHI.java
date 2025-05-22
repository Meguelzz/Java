package br.edu.etec.model;

public class GHI extends Fun {

    public GHI(String nome, double salario, int anoAdmissao) {
        super(nome, salario, anoAdmissao);
    }

    @Override
    public double calcularPL(int anoAt) {
        return (anoAt - anoAdmissao >= 5) ? salario * 2 : 0;
    }
}