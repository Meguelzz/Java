package br.edu.etec.model;

public class Leao extends Animal {
    public Leao(String nome, int idade, Habitat habitat){
        super(nome, idade, Habitat.TERRESTRE);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O leão ruge: Rooooar");
    }
    
}
