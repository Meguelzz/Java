public class Main {
    public static void main(String [] args) {

    Veiculo veiculo = new Veiculo ("Caloi", "123", 2008);
    Carro carro = new Carro ("Saveiro Cross", "456", 2010);
    Moto moto = new Moto ("Yamaha", "789", 2014);

    veiculo.exibirDetalhes();
    carro.exibirDetalhesCarro();
    moto.exibirDetalhesMoto();

    }
}
