public class nadador {
    // Atributos da classe
    
    String nome;
    int idade;

    // construtor da classe

    public nadador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // metodo getters para acessar os atributos de classes

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

     // metodo main para criar classe objeto e definir os valores do atributo

    public static void main(String[] args){
        nadador nadador = new nadador("Yan", 21);
        System.out.println("Nome: " + nadador.getNome());
        System.out.println("Idade: " + nadador.getIdade());
    }

}