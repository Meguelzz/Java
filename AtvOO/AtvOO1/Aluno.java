public class Aluno extends Pessoa{
    int RA;
    String curso;

    Aluno( String nome, String CPF, String dtNasc, int RA, String curso) {
       super(nome, CPF, dtNasc);
       this.RA=RA;
       this.curso=curso;
    }
}