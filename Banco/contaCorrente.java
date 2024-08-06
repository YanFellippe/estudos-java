package Banco;

public class contaCorrente extends contaBancaria{
    private double limite;

    public contaCorrente(String numero, double saldo, double limite){
        super(numero, saldo);
        this.limite = 10000;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.printf("Limite: %f \n", limite);
    }
}
