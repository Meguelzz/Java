package AtvFuncionarios;

public class Desenvolvedor extends Funcionario {
    String linguagemProgramacao;

    Desenvolvedor(String Nome, int Idade, double Salario) {
        super(Nome, Idade, Salario);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public void exibirInformacoesDesenvolvedor(){
        System.out.println("Nome: " + Nome);
        System.out.println("Idade: " + Idade);
        System.out.println("Salário: " + Salario);
        System.out.println("Linguagem de Programação" + linguagemProgramacao);
    }
}