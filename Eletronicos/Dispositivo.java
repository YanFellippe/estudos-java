package Eletronicos;

public class Dispositivo {
    private String marca;
    private String modelo;

    public Dispositivo(String marca2, String modelo2) {
        this.marca = marca2;
        this.modelo = modelo2;
    }

    public void setInfo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void informacoes(){
        System.out.printf("Marca: %s\nModelo: %s\n", marca, modelo);
    }
}
