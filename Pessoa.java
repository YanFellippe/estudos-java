public class Pessoa {
     private String nome;
     private int idade;

    //  Método Setter para o atributo nome
    public void setNome(String nome){
        this.nome = nome; //atualiza o valor do atributo nome
    }

    public void setIdade(int idade){
        this.idade = idade; //atualiza o valor do atributo idade
    }

    // metodfo Getter para o atributo nome (mostra o valor)
    public String getNome(){
        return nome; //retorna o valor do atributo nome
    }

    public int getIdade() {
        return idade; //retorna o valor do atributo idade
    }
    
    // método main para testar a classe Pessoa
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); //cria um objeto da classe Pessoa
        pessoa.setNome("Yanzinho"); //define o nome do objeto
        pessoa.setIdade(22); //retorna o valor do atributo
        System.out.println("Nome: " + pessoa.getNome()); //exibe o nome do objeto
        System.out.println("Idade: " + pessoa.getIdade()); //exibe a idade do objeto
    }
}
