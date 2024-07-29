public class contaBancaria {
    private int numero;
    private int saldo;

    public int getNumero(){
        return numero;
    }

    public int getSaldo(){
        return saldo;
    }

    public contaBancaria(int saldo, int num){
        this.saldo = saldo;
        this.numero = num;
    }

    public static void main(String[] args){
        contaBancaria contaBancaria = new contaBancaria(790096789, 100101);
        System.out.println("Número da conta: " + contaBancaria.getNumero());
        System.out.println("Saldo da conta: R$" + contaBancaria.getSaldo());
    }
}
