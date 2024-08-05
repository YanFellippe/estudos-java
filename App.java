import Animal.Gato;
import Animal.Cachorro;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Floquinho");
        cachorro.comer();
        cachorro.latir();
        cachorro.beber();
        cachorro.lamber();
        
        Gato gato = new Gato("Mingau");
        gato.comer();
        gato.beber();
        gato.miar();
    }
}
