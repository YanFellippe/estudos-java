package Banco;

public class contaBancaria {
    private String numero;
    private double saldo;

    public void setDados(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public contaBancaria(String numero2, double saldo2) {
        this.numero = numero2;
        this.saldo = saldo2;
    }

    public String getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void exibirDetalhes(){
        System.out.printf("Número da conta: %s \n Saldo %f \n", numero, saldo);
    }
}
