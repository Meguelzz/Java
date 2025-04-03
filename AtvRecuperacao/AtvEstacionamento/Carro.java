public class Carro extends Veiculo {
    int NumeroPortas;

    Carro(String Modelo, String Placa, int Ano) {
        super(Modelo, Placa, Ano);
        this.NumeroPortas = NumeroPortas;
    }

    public void exibirDetalhesCarro(){
        System.out.println("Modelo: " + Modelo);
        System.out.println("Placa: " + Placa);
        System.out.println("Ano: " + Ano);
        System.out.println("Número de Portas: " + NumeroPortas);
    }
}
