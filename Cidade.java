public class Cidade {
    private String nome;
    private String populacao;

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String setPopulacao(String populacao){
        return this.populacao = populacao;
    }

    public String getNome(){
        return nome;
    }

    public String getPopulacao(){
        return populacao;
    }

    public static void main(String[] args){
        Cidade cidade = new Cidade();
        cidade.setNome("Sigma");
        cidade.setPopulacao("Bahia");

        System.out.println(cidade.getNome() + " da " + cidade.getPopulacao());
    }
}
