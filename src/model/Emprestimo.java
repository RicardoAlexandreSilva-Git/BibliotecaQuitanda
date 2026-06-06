package model;

import java.time.LocalDate;

public class Emprestimo {

    private Cliente cliente;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private boolean devolvido;

    public Emprestimo(Cliente cliente, Livro livro) {

        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.devolvido = false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void devolver() {
        this.devolvido = true;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getNome() + " | Livro: " + livro.getNomeLivro() + " | Data: " + dataEmprestimo + " | Devolvido: " + devolvido;
    }
}