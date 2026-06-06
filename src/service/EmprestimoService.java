package service;

import dao.EmprestimoDAO;
import exceptions.LivroNaoEncontradoException;
import exceptions.LivroSemEstoqueException;
import model.Cliente;
import model.Emprestimo;
import model.Livro;

public class EmprestimoService {

    private EmprestimoDAO dao = new EmprestimoDAO();

    public void emprestarLivro(Cliente cliente, Livro livro){

        if(livro.getEstoqueLivro() <= 0){
            throw new LivroSemEstoqueException(livro.getNomeLivro());
        }

        livro.setEstoqueLivro(livro.getEstoqueLivro() - 1);
        dao.salvar(new Emprestimo(cliente, livro));
        System.out.println("Empréstimo realizado.");
    }

    public void devolverLivro(String codigoLivro){

        Emprestimo emprestimo = dao.buscarEmprestimoAtivo(codigoLivro);

        if(emprestimo == null){
            throw new LivroNaoEncontradoException(codigoLivro);
        }
        emprestimo.devolver();
        Livro livro = emprestimo.getLivro();
        livro.setEstoqueLivro(livro.getEstoqueLivro() + 1);
        System.out.println("Livro devolvido com sucesso.");
    }
}