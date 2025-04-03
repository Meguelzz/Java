package AtvForma;

public class Retangulo extends Forma{
    double Largura;
    double Altura;

    Retangulo(String Nome, double Largura, double Altura){
        super(Nome);
        this.Largura = Largura;
        this.Altura = Altura;
    }

    public void calcularArea(){
        double calcArea = Largura * Altura;
        System.out.println("Área: " + calcArea);
    }
}