package AtvLoja;

public class Main {

    public static void main(String[] args) {
        Produto produto  = new Produto("Batata", 10.00);
    
        ProdutoComDesconto produtocComDesconto  = new ProdutoComDesconto("Cenoura", 10.00, 2.00);

    produto.exibirDetalhes();
    produtocComDesconto.exibirDetalhesComDesconto();
    }
}