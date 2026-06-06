package exceptions;

public class ClienteJaCadastradoException extends RuntimeException {

    public ClienteJaCadastradoException(String cpf) {
        super("Já existe cliente cadastrado com CPF: " + cpf);
    }
}