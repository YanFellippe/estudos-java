public class Produtos {
    private String nome;
    private float qtd;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtd(float qtd) {
        if(qtd >= 0){
            this.qtd = qtd;
        } else{
            System.out.println("Quantidade inválida. Quantidade deve ser um número positivo.");
        }
    }

    public String getNome(){
        return nome;
    }

    public float getQtd(){
        return qtd;
    }

    public static void main(String[] args) {
        Produtos produto1 = new Produtos();
        produto1.setNome("Notebook");
        produto1.setQtd(-1);
        System.out.println("Nome do produto: " + produto1.getNome() + ". Quantidade em estoque: " + produto1.getQtd());
    }
}
