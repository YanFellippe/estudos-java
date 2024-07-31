import java.util.Scanner;

public class Filme1 {
    private String titulo;
    private int idadeMin;
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIdadeMinima(int idadeMin) {
        if(idadeMin >= 18){
            this.idadeMin = idadeMin;
        } else {
            System.out.println("Menor de idade! A classificação mínima é de 18 anos.");
            this.idadeMin = idadeMin;
        }
    }

    public String getTitulo(){
        return titulo;
    }
    public int getIdadeMin(){
        return idadeMin;
    }

    public static void main(String[] args){
        Filme1 filme = new Filme1();
        filme.setTitulo("Dead Pool e Wollverine");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        filme.setIdadeMinima(scan.nextInt());
        scan.close();
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Classificação mínima: " + filme.getIdadeMin());
    }
}
