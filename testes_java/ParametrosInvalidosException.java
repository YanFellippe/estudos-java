// Exceção customizada
public class ParametrosInvalidosException extends Exception {
    // Construtor que passa a mensagem para a superclasse Exception
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
