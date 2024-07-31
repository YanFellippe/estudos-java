public class Livro1 {
    private String titulo;
    private int paginas;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPaginas(int paginas) {
        if(paginas >= 10){
            this.paginas = paginas;
        } else {
            System.out.println("Número de páginas inválido. Deve ser pelo menos 10.");
            this.paginas = paginas;
        }
    }

    public String getTitulo(){
        return titulo;
    }

    public int getPaginas(){
        return paginas;
    }

    public static void main(String[] args){
        Livro1 livro = new Livro1();
        livro.setTitulo("Sonho de Valsa");
        livro.setPaginas(9);
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Número de páginas: " + livro.getPaginas());
    }
}
