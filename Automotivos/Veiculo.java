package Automotivos;

public class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca2, String modelo, int ano2) {
        this.marca = marca2;
        this.ano = ano2;
    }

    public void Dados(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public void apresentar() {
        System.out.printf("Marca: %s\nAno: %d\n" , marca, ano);
    }
}
