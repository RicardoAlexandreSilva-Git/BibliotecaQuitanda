package dao;

import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
    private List<Livro> livros = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        Livro existente = buscarLivro(livro.getCodigoLivro());

        if(existente == null){
            livros.add(livro);
        }
        else {
            existente.setEstoqueLivro(existente.getEstoqueLivro() + livro.getEstoqueLivro());
        }
    }

    public Livro buscarLivro(String codigo) {
        return livros.stream().filter(l -> l.getCodigoLivro().equals(codigo)).findFirst().orElse(null);
    }

    public void listarLivros() {
        livros.forEach(System.out::println);
    }

    public void removerLivro(String codigo) {
        livros.removeIf(l -> l.getCodigoLivro().equals(codigo));
    }
}