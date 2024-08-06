package Automotivos;
public class AppC {
    public static void main(String[] args){
        Carro carro = new Carro("Fiat", "Uno", 1990, 4);
        carro.apresentar();
        System.out.println("\n");
        Moto moto = new Moto("Kawasaki", "Ninja", 2024, 6);
        moto.apresentar();
    }
}
