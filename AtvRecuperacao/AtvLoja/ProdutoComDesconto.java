public class ProdutoComDesconto extends Produto {
    double Desconto;

    ProdutoComDesconto(String Nome, double Preco, double Desconto){
       super(Nome, Preco);
       this.Desconto = Desconto;
    }

    public void exibirDetalhesComDesconto(){
        double precoComDesconto = Preco - Desconto;
        System.out.println("Produto: " + Nome);
        System.out.println("Preço: " + precoComDesconto);
    }
}
