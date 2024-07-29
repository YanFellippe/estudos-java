public class carro {
    private String cor;
    private String modelo;
    private String marca;

    void acelerar(){
        System.out.println("O carro está acelerando");
    }

    void frear(){
        System.out.println("O carro está freando");
    }

    void virar(String direcao){
        System.out.println("O carro está virando para a " + direcao + ".");
    }

        public String getCor(){
            return cor;
        }

        public String getModelo(){
            return modelo;
        }

        public String getMarca(){
            return marca;
        }

    public static void main(String[]args){
        carro meuCarro = new carro();
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "Purosangue";
        meuCarro.marca = "Ferrari";
        System.out.println("Meu carro é " + meuCarro.getMarca() + " " + meuCarro.getModelo() + " de cor " + meuCarro.getCor());
            
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.virar("esquerda");
    }
 
    
}
