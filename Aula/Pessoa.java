package Aula;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome2, int idade2) {
        this.nome = nome2;
        this.idade = idade2;
    }

    public void setDados(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void apresentar(){
        System.out.printf(" \n Nome: %s , \n Idade: %d " , nome, idade);
    }

}