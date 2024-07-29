public class Curso {
    private String nome;
    private int duracao;

    public Curso(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuração() {
        return duracao;
    }

    public static void main(String[] args) {
        Curso curso = new Curso("Java - Básico ao Avançado", 4000);
        System.out.println("Nome do Curso: " + curso.getNome());
        System.out.println("Duração: " + curso.getDuração() + " horas");
    }
}
