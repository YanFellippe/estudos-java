package Eletronicos;

public class Celular extends Dispositivo{
    private String sistemaOperacional;

    public Celular(String marca, String modelo, String sistemaOperacional) {
        super(marca, modelo);
        this.sistemaOperacional = sistemaOperacional;
    }

    public void informacoes(){
        super.informacoes();  // Imprime as informações do dispositivo pai
        System.out.printf("Sistema Operacional: %s \n", sistemaOperacional);
    }
}
