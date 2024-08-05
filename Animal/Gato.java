package Animal;

public class Gato extends Animais{
    public Gato(String nome) {
        super(nome);
    }
        
    public void miar() {
        System.out.printf("%s miou\n", getNome());
    }

    public void comer(){
        System.out.printf("%s comeu\n", getNome());
    }

    public void beber(){
        System.out.printf("%s bebeu\n", getNome());
    }
}
