package service;

import dao.LivroDAO;
import exceptions.LivroNaoEncontradoException;
import model.Livro;

public class LivroService {
    private LivroDAO dao = new LivroDAO();

    public void cadastrarLivro(String nome, String codigo, int estoque){
        dao.cadastrarLivro(new Livro(nome,codigo,estoque));
    }

    public Livro buscarLivro(String codigo){
        Livro livro = dao.buscarLivro(codigo);
        if(livro == null){
            throw new LivroNaoEncontradoException(codigo);
        }
        return dao.buscarLivro(codigo);
    }

    public void listarLivros(){
        dao.listarLivros();
    }

    public void removerLivro(String codigo){
        dao.removerLivro(codigo);
    }
}