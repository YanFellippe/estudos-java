package Aula;

public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String nome, int idade, String curso){
        super(nome, idade);
        this.curso = curso;
    }

    public void apresentar(){
        super.apresentar();
        System.out.printf(" \n Curso: %s ", curso);
    }
}
