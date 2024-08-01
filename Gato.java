import java.util.Scanner;

public class Gato {
    private String nome;

    void comeu(){
        System.out.println(nome + " comeu!");
    }

    void bebeu(){
        System.out.println(nome + " bebeu!");
    }

    void miou(){
        System.out.println(nome + " miou!");
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args){
        Gato cat = new Gato();

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do gato: ");
        cat.setNome(scan.nextLine());
        scan.close();
        System.out.println("Seu gato se chama:" + cat.getNome());

        cat.comeu();
        cat.bebeu();
        cat.miou();
    }
}
