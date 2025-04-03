public class Moto extends Veiculo {
    int Cilindradas;

    Moto(String Modelo, String Placa, int Ano) {
        super(Modelo, Placa, Ano);
        this.Cilindradas = Cilindradas;
    }

    public void exibirDetalhesMoto(){
        System.out.println("Modelo: " + Modelo);
        System.out.println("Placa: " + Placa);
        System.out.println("Ano: " + Ano);
        System.out.println("Cilindradas: " + Cilindradas);
    }
}
