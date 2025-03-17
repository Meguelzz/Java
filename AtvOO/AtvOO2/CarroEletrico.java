public class CarroEletrico extends Carro {
    double capacidadeBateria;

    public CarroEletrico(String marca, String modelo, int ano, String Combustivel, double capacidadeBateria) {
        super(marca, modelo, ano, Combustivel);
        this.capacidadeBateria = capacidadeBateria;
    }
}