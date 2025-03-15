import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Criação do scanner para leitura dos parâmetros via terminal
        Scanner terminal = new Scanner(System.in);
        
        // Solicita o primeiro parâmetro ao usuário
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();  // Captura o primeiro número
        
        // Solicita o segundo parâmetro ao usuário
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();  // Captura o segundo número
        
        try {
            // Chama o método que contém a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException exception) {
            // Se ocorrer a exceção, exibe a mensagem de erro
            System.out.println(exception.getMessage());
        }
    }

    // Método que realiza a contagem e valida os parâmetros
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            // Se for maior, lança a exceção com a mensagem correspondente
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Calcula a quantidade de interações (contagem)
        int contagem = parametroDois - parametroUm;
        
        // Loop para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            // Imprime "Imprimindo o número" seguido do número atual
            System.out.println("Imprimindo o número " + i);
        }
    }
}
