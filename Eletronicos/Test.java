package Eletronicos;

public class Test {
    public static void main(String[] args){
        Celular cell = new Celular("Samsung", "S24 Ultra", "Android");
        cell.informacoes();
        System.out.println("\n");
        Laptop pc = new Laptop("Acer", "Nitro 5", 24);
        pc.informacoes();
    }
}
