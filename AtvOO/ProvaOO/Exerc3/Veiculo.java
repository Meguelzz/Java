package Exerc3;

public class Veiculo {
    String Modelo;
    String Cor;
    int Velocidade;

    public void Acelerar() {
        this.Velocidade = 0; 
    }

    public void acelerar(int incremento) {
        this.Velocidade += incremento; 
    }

    public int getAcelerar() {
        return this.Velocidade; 
    }

    public Veiculo() {
        this.Velocidade = 0; 
    }

    public void frear(int decremento) {
        this.Velocidade -= decremento; 
    }

    public int getFrear() {
        return this.Velocidade; 
    }
}