public class Professor extends Pessoa {
    private String disciplina;
    private String rf;

    public Professor(String nome, String cpf, String dataNascimento, String disciplina, String rf) {
        super(nome, cpf, dataNascimento);
        this.disciplina = disciplina;
        this.rf = rf;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getRf() {
        return rf;
    }
}