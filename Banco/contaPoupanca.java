package Banco;

public class contaPoupanca extends contaBancaria{
    private double juros;

    public contaPoupanca(String numero, double saldo, double juros){
        super(numero, saldo);
        this.juros = juros;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.printf("Juros: %f \n", juros);
    }
}
