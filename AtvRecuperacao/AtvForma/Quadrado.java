package AtvForma;

public class Quadrado extends Retangulo{
    double Lado;
    

    Quadrado(String Nome, double Lado, double Largura, double Altura){
        super(Nome, Largura, Altura);
        this.Lado = Lado;
    }

    public void calcularArea(){
        double calcArea = Largura * Altura;
        System.out.println("Área: " + calcArea);
    }
}
