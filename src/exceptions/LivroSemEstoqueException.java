package exceptions;

public class LivroSemEstoqueException extends RuntimeException {

    public LivroSemEstoqueException(String nomeLivro) {

        super("Livro sem estoque: " + nomeLivro);
    }
}