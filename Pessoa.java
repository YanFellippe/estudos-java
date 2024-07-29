public class Pessoa {
     private String nome;

    //  Método Setter para o atributo nome
    public void setNome(String nome){
        this.nome = nome; //atualiza o valor do atributo nome
    }

    // metodfo Getter para o atributo nome (mostra o valor)
    public String getNome(){
        return nome; //retorna o valor do atributo nome
    }
    
    // método main para testar a classe Pessoa
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); //cria um objeto da classe Pessoa
        pessoa.setNome("Yanzinho"); //define o nome do objeto
        System.out.println("Nome: " + pessoa.getNome()); //exibe o nome do objeto
    }
}
