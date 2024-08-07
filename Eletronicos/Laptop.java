package Eletronicos;

public class Laptop extends Dispositivo{
    private int ram;

    public Laptop(String marca, String modelo, int ram) {
        super(marca, modelo);
        this.ram = ram;
    }

    public void informacoes(){
        super.informacoes();
        System.out.printf("Ram: %d GB \n", ram);
    }
}
