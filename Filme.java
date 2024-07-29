public class Filme {

    // Atributos da classe
    private String titulo;
    private String ator;
    private String diretor;
    private int anoDeLancamento; 
    private String genero; 

    // Construtor da classe
    public Filme(String titulo, String ator, String diretor, int anoDeLancamento, String genero) {
        this.titulo = titulo;
        this.ator = ator;
        this.diretor = diretor;
        this.anoDeLancamento = anoDeLancamento;
        this.genero = genero;
    }

    // Métodos getters para acessar os atributos
    public String getTitulo() {
        return titulo;
    }

    public String getAtor() {
        return ator;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getGenero() {
        return genero;
    }

    // Método main para criar um objeto e definir os valores dos atributos
    public static void main(String[] args) {
        // Criando um objeto da classe Filme e definindo os valores dos atributos
        Filme filme = new Filme("Inception", "Leonardo DiCaprio", "Christopher Nolan", 2010, "Ficção Científica");

        // Exibindo os valores dos atributos do objeto
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Ator: " + filme.getAtor());
        System.out.println("Diretor: " + filme.getDiretor());
        System.out.println("Ano de Lançamento: " + filme.getAnoDeLancamento());
        System.out.println("Gênero: " + filme.getGenero());
    }
}