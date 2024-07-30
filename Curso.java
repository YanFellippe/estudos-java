public class Curso {
    private String nome;
    private int duracao;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuração() {
        return duracao;
    }

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setNome("Java - Básico ao Avançado");
        curso1.setDuracao(4000);
        System.out.println("Nome do Curso: " + curso1.getNome());
        System.out.println("Duração: " + curso1.getDuração() + " horas");
    }
}
