import java.util.Scanner;

public class Cachorro {
    private String nome;

   void comeu(){
        System.out.println(nome + " comeu.");
   }

   void bebeu(){
        System.out.println(nome + " bebeu.");
   }

   void latir(){
        System.out.println(nome + " latiu.");
   }

   void lambeu(){
        System.out.println(nome + " lambeu.");
   }

   public void setNome(String nome){
        this.nome = nome;
   }

   public String getNome(){
        return nome;
   }

   public static void main(String[] args){
        Cachorro dog = new Cachorro();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Digite o nome do Cachorro: ");
        dog.setNome(scan1.nextLine());
        scan1.close();
        System.out.println("Seu cachorro se chama: " + dog.getNome());

        dog.comeu();
        dog.bebeu();
        dog.latir();
        dog.lambeu();
   }
}
