public class Produto{
    private String nome;
    private int preco;
    private int quantidade;

    public Produto(String nome, int preco, int quantidade){
        this.nome = "Notebook";
        this.preco = 4000;
        this.quantidade = 5;
    }

    public String getNome(){
        return nome;
    }

    public int getPreco(){
        return preco;
    }
    
    public int getQuantidade(){
        return quantidade;
    }

    public static void main(String[] args){
        Produto produto = new Produto("Notebook", 4000, 5);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}