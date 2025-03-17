public class Funcionario extends Pessoa {
    private String cargo;
    private String rgm;

    public Funcionario(String nome, String cpf, String dataNascimento, String cargo, String rgm) {
        super(nome, cpf, dataNascimento);
        this.cargo = cargo;
        this.rgm = rgm;
    }

    public String getCargo() {
        return cargo;
    }

    public String getRgm() {
        return rgm;
    }
}