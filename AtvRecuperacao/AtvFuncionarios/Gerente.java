package AtvFuncionarios;

public class Gerente extends Funcionario{
    String Departamento;

    Gerente(String Nome, int Idade, double Salario, String Departamento) {
        super(Nome, Idade, Salario);
        this.Departamento = Departamento;}

    public void exibirInformacoesGerente() {
        System.out.println("Nome:" + Nome);
        System.out.println("Idade:" + Idade);
        System.out.println("Salário: " + Salario);
        System.out.println("Departamento: " + Departamento);        
    }
}
