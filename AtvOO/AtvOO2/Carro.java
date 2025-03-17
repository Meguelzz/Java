public class Carro extends Veiculo {
    String Combustivel;

    public Carro(String marca, String modelo, int ano, String Combustivel) {
        super(marca, modelo, ano);
        this.Combustivel = Combustivel;
    }
}
