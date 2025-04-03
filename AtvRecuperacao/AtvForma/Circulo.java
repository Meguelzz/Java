package AtvForma;

public class Circulo extends Forma{
    double Raio;

    Circulo(String Nome, double Raio){
        super(Nome);
        this.Raio = Raio;
    }

    public void calcularRaio(){
        double calcRaio = Raio * Raio * Math.PI;
        System.out.println("Raio: " + calcRaio);
    }

}
