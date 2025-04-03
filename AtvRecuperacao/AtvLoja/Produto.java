public class Produto {
    String Nome;
    double Preco;
    
    public Produto(String Nome, double Preco){
            this.Nome = Nome;
            this.Preco = Preco;}

    public void exibirDetalhes(){
        System.out.println("Produto: " + Nome);
        System.out.println("Preço: " + Preco);
        }
}

