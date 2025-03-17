public class Aluno extends Pessoa {
    private String ra;
    private String curso;

    public Aluno(String nome, String cpf, String dataNascimento, String ra, String curso) {
        super(nome, cpf, dataNascimento);
        this.ra = ra;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public String getCurso() {
        return curso;
    }
}