public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Nissan", "Kicks", 2016);
        Carro carro = new Carro("Volkswagen", "Saveiro Cross", 2010, "Gasolina");
        CarroEletrico carroEletrico = new CarroEletrico("Renault", "Kwid E-Tech", 2024, "Eletrico", 26.8);

        System.out.println("Veículo: " + veiculo.marca + ", " + veiculo.modelo + ", " + veiculo.ano);
        System.out.println("Carro: " + carro.marca + ", " + carro.modelo + ", " + carro.ano + ", " + carro.Combustivel);
        System.out.println("Carro Elétrico: " + carroEletrico.marca + ", " + carroEletrico.modelo + ", " + carroEletrico.ano + ", " + carroEletrico.Combustivel + ", " + carroEletrico.capacidadeBateria + " kWh");
    }
}