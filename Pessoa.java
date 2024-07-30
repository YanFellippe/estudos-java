public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;
    
    // Construtor
    public Pessoa(String nome, int idade) { this.nome = nome;
        this.idade = idade;
    }
    
    // Métodos públicos para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
    // Podemos adicionar lógica para validação
        if (idade >= 0) {
            this.idade = idade;
        }
    }
    
    // Método para exibir as informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
    
    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criação de um objeto Pessoa
        Pessoa pessoa = new Pessoa("Alice", 30);
        // Exibir as informações da pessoa
        pessoa.exibirInformacoes();
        // Alterar e exibir as novas informações
        pessoa.setNome("Maria"); pessoa.setIdade(28);
        pessoa.exibirInformacoes();
    }
    
}
