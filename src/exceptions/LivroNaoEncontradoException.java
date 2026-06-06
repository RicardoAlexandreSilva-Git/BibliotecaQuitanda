package exceptions;

public class LivroNaoEncontradoException extends RuntimeException {

    public LivroNaoEncontradoException(String codigo) {
        super("Livro não encontrado. Código: " + codigo);
    }
}