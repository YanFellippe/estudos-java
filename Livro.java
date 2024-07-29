public class Livro {
    String titulo;
    String autor;
    int ano;
    int vendas;

    public Livro(String titulo, String autor, int ano, int vendas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.vendas = vendas;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAno(){
        return ano;
    }

    public int getVendas(){
        return vendas;
    }

    public static void main(String[] args){
        Livro livro = new Livro("Um conto de um Sigma", "Sigma da Bahia", 2024, 123456789);
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de Lançamento: " + livro.getAno());
        System.out.println("Vendas: " + livro.getVendas());
    }
}
