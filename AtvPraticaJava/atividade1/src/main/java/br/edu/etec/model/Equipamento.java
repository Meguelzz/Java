package br.edu.etec.model;

public class Equipamento {
    String nome;
    String modelo;
    
    public Equipamento (String nome, String modelo){
        this.nome = nome;
        this.modelo = modelo;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
    }

}