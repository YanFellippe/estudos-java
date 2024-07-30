public class contaBancaria {
    private int numero;
    private float saldo;

    public void setNumero(int num){
        this.numero = num;
    }

    public int getNumero(){
        return numero;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo(){
        return saldo;
    }

    public static void main(String[] args){
        contaBancaria contaBancaria1 = new contaBancaria();
        contaBancaria1.setNumero(10110);
        contaBancaria1.setSaldo(987654321);
        System.out.println("Número da conta: " + contaBancaria1.getNumero());
        System.out.println("Saldo da conta: R$" + contaBancaria1.getSaldo());
    }
}
