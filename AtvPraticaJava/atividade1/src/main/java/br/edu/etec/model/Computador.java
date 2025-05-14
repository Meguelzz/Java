package br.edu.etec.model;

public class Computador extends Equipamento {
    String processador;

    public Computador(String nome, String modelo, String processador) {
        super(nome, modelo);
        this.processador = processador;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Processador: " + processador);
    }

}
