public class Computador {
    String nome;
    String processador;
    String ram;
    String ssd;

    public String getNome(){
        return nome;
    }

    public String getProcessador(){
        return processador;
    }

    public String getRam(){
        return ram;
    }

    public String getSSD(){
        return ssd;
    }

    public Computador(String nome, String processador, String ram, String ssd){
        this.nome = nome;
        this.processador = processador;
        this.ram = ram;
        this.ssd = ssd;
    }

    public static void main(String[] args){
        Computador computador1 = new Computador("PC Gamer", "Intel Core i9", "32GB", "SSD 2TB");
        System.out.println("Nome: " + computador1.getNome());
        System.out.println("Processador: " + computador1.getProcessador());
        System.out.println("RAM: " + computador1.getRam());
        System.out.println("SSD: " + computador1.getSSD());
    }
}
