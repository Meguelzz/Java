package br.edu.etec.test;

import br.edu.etec.model.Animal;
import br.edu.etec.model.Arara;
import br.edu.etec.model.Golfinho;
import br.edu.etec.model.Leao;

public class Teste {
    public static void main(String[] args) {
        Animal leao = new Leao("Simba", 5, Animal.Habitat.TERRESTRE);
        Animal golfinho = new Golfinho("Flipper", 3, Animal.Habitat.AQUATICO);
        Animal arara = new Arara("Azul", 2, Animal.Habitat.AEREO);

        System.out.println("--------------------------");
        leao.exibirInfo();
        leao.emitirSom();

        System.out.println("--------------------------");
        golfinho.exibirInfo();
        golfinho.emitirSom();

        System.out.println("----------------------");
        arara.exibirInfo();
        arara.emitirSom();
    }
}
