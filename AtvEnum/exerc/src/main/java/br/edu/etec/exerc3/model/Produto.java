package br.edu.etec.exerc3.model;

public class Produto{

    public enum ClassificacaoProduto{
        Básico("Produto simples"),
        Padrão("Produto padrão"),
        Premium("Produto de alto nível");

        private String descricao;

        ClassificacaoProduto(String descricao){
            this.descricao = descricao;
        }

        public String getDescricao(){
            return descricao;
        }

    }

    public static void main(String[] args) {
        for (ClassificacaoProduto classificacao : ClassificacaoProduto.values()) {
            System.out.println(classificacao.name() + ": " + classificacao.getDescricao());
        }
    }
}