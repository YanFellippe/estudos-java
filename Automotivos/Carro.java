package Automotivos;

public class Carro extends Veiculo{
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas){
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    public void apresentar(){
        super.apresentar();
        System.out.printf("Número de portas: %d\n", numPortas);
    }

}
