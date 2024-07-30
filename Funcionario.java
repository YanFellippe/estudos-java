public class Funcionario {
    private String nome;
    private int salario;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public int getSalario(){
        return salario;
    }

    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Yan");
        funcionario1.setSalario(25998);
        System.out.println("Nome do funcionário: " + funcionario1.getNome());
        System.out.println("Salário: R$" + funcionario1.getSalario());
    }
}
