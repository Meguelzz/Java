package AtvFuncionarios;

public class Main {
    public static void main(String [] args) {

    Funcionario funcionario = new Funcionario("Lurdes", 40, 2.500);
    Gerente gerente = new Gerente("Marcos", 38, 4.700, "Administração");
    Desenvolvedor desenvolvedor = new Desenvolvedor("Paulo", 38, 9.000);

    funcionario.exibirInformacoes();
    gerente.exibirInformacoesGerente();
    desenvolvedor.exibirInformacoesDesenvolvedor();
    }
}
