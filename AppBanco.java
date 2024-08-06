import Banco.contaCorrente;
import Banco.contaPoupanca;

public class AppBanco{
    public static void main(String[] args){
        contaCorrente conta1 = new contaCorrente("12345", 1000.0, 1000.0);
        conta1.exibirDetalhes();
        System.out.println("\n");
        contaPoupanca conta2 = new contaPoupanca("67890", 2000.0, 0.05);
        conta2.exibirDetalhes();
    }
}
