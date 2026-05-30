package model;

public class Livro {
    private String nomeLivro;
    private Integer estoqueLivro;

    public Livro(String nomeLivro, Integer estoqueLivro){
        this.nomeLivro= nomeLivro;
        this.estoqueLivro= estoqueLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Integer getEstoqueLivro() {
        return estoqueLivro;
    }

    public void setEstoqueLivro(Integer estoqueLivro) {
        this.estoqueLivro = estoqueLivro;
    }
}
