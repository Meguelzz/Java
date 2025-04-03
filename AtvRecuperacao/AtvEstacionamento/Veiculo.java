public class Veiculo {
    String Modelo;
    String Placa;
    int Ano;

    Veiculo(String Modelo, String Placa, int Ano) {
        this.Modelo = Modelo;
        this.Placa = Placa;
        this.Ano = Ano;
    }

    public void exibirDetalhes(){
        System.out.println("Modelo: " + Modelo + "Placa: " + Placa + "Ano: " + Ano);}
}
