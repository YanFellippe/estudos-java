package Automotivos;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas){
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public void apresentar(){
        super.apresentar();
        System.out.printf("Cilindradas: %d\n", cilindradas);
    }
}
