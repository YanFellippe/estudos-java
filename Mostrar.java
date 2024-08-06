import Aula.Aluno;
import Aula.Professor;

public class Mostrar {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Yan", 22, "Técnico em Desenvolvimento de Sistemas");
        aluno.apresentar();
        System.out.println("\n");
        Professor professor = new Professor("Rafael Bomfin", 45, "ADS");
        professor.apresentar();
    }
}
