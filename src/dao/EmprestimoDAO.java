package dao;

import model.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoDAO {

    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void salvar(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public List<Emprestimo> listarEmprestimos() {
        return emprestimos;
    }

    public Emprestimo buscarEmprestimoAtivo(String codigoLivro) {
        return emprestimos.stream().filter(emprestimo -> emprestimo.getLivro().getCodigoLivro().equals(codigoLivro) && !emprestimo.isDevolvido()).findFirst().orElse(null);
    }

    public void listarEmprestimosAtivos() {
        emprestimos.stream().filter(emprestimo -> !emprestimo.isDevolvido()).forEach(System.out::println);
    }
}