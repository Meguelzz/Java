package br.edu.etec.Aluno.teste;

import br.edu.etec.Aluno.model.Aluno;

public class Exerc6 {

    public static void main(String[] args) {
          Aluno a1 = new Aluno();
         a1.setNome("Miguel");
         a1.setNota1(8.0);
         a1.setNota2(10.00);
         a1.calcularMedia(0, 0);
         a1.estaAprovado();

         Aluno a2 = new Aluno();
         a2.setNome("Gustavo");
         a2.setNota1(3.0);
         a2.setNota2(4.0);
         a2.calcularMedia(0, 0);
         a2.estaAprovado();
    }
}
