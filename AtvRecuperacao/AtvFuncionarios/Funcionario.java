package AtvFuncionarios;

public class Funcionario {
    String Nome;
    int Idade;
    double Salario;

    Funcionario(String Nome, int Idade, double Salario){
        this.Nome = Nome;
        this.Idade = Idade;
        this.Salario = Salario;
    }

    public void exibirInformacoes(){
        System.out.println("Nome:" + Nome);
        System.out.println("Idade:" + Idade);
        System.out.println("Salário:" + Salario);
    }
}
