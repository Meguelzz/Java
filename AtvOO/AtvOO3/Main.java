public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João Silva", "123.456.789-00", "01/01/1980");
        Aluno aluno = new Aluno("Maria Souza", "987.654.321-00", "02/02/2000", "2021001", "Engenharia");
        Professor professor = new Professor("Carlos Pereira", "111.222.333-44", "03/03/1975", "Matemática", "RF12345");
        Funcionario funcionario = new Funcionario("Ana Lima", "555.666.777-88", "04/04/1985", "Secretária", "RGM67890");

        System.out.println("Pessoa: " + pessoa.getNome() + ", CPF: " + pessoa.getCpf() + ", Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Aluno: " + aluno.getNome() + ", CPF: " + aluno.getCpf() + ", Data de Nascimento: " + aluno.getDataNascimento() + ", RA: " + aluno.getRa() + ", Curso: " + aluno.getCurso());
        System.out.println("Professor: " + professor.getNome() + ", CPF: " + professor.getCpf() + ", Data de Nascimento: " + professor.getDataNascimento() + ", Disciplina: " + professor.getDisciplina() + ", RF: " + professor.getRf());
        System.out.println("Funcionario: " + funcionario.getNome() + ", CPF: " + funcionario.getCpf() + ", Data de Nascimento: " + funcionario.getDataNascimento() + ", Cargo: " + funcionario.getCargo() + ", RGM: " + funcionario.getRgm());
    }
}