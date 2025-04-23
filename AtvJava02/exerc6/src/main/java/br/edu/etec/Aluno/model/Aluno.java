package br.edu.etec.Aluno.model;

public class Aluno {
     private String nome;
    private double nota1;
    private double nota2;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
        System.out.println("Nome: "+ getNome());
    }

    public double getNota1(){
        return nota1;
    }

    public void setNota1(double nota1){
        if (nota1 >= 0 && nota1 <=10) {
            this.nota1 = nota1;
        System.out.println("1º Nota: "+ getNota1());
        } else {
            System.out.println("Valor inválido");
        }
        
    }

    public double getNota2(){
        return nota2;
    }

    public void setNota2(double nota2){
        if (nota2 >= 0 && nota2 <=10) {
            this.nota2 = nota2;
        System.out.println("2º Nota: "+ getNota2());
        } else {
            System.out.println("Valor inválido");
        }
    }

    public double calcularMedia(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }

    public void estaAprovado(){
        if (calcularMedia(nota1, nota2) >=6) {
            System.out.println("Média: " + calcularMedia(nota1, nota2));
            System.out.println("Aprovado!!");
        } else {
            System.out.println("Média: " + calcularMedia(nota1, nota2));
            System.out.println("Reprovado");
        }
    }
}
