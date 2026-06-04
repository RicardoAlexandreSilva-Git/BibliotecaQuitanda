package model;

public class Emprestimo {
    private Cliente cliente;
    private Livro livro;
    private boolean devolvido;

    public Emprestimo(Cliente cliente, Livro livro){
        this.cliente=cliente;
        this.livro=livro;
        this.devolvido=false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public boolean isDevolvido(){
        return devolvivo;
    }

    public void devolver(){
        devolvido=true;
    }
}
