package Animal;

public class Cachorro extends Animais{
    public Cachorro(String nome){
        super(nome);
    }
        
    public void latir(){
        System.out.printf("%s latiu\n", getNome());
    }
       
    public void lamber(){
        System.out.printf("%s lambeu\n", getNome());
    }

    public void comer(){
        System.out.printf("%s comeu\n", getNome());
    }

    public void beber(){
        System.out.printf("%s bebeu\n", getNome());
    }
}
