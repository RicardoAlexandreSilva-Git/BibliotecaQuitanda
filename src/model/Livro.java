package model;

public class Livro {
    private String nomeLivro;
    private String codigoLivro;
    private int estoqueLivro;

    public Livro(String nomeLivro, String codigoLivro, int estoqueLivro){
        this.nomeLivro=nomeLivro;
        this.codigoLivro=codigoLivro;
        this.estoqueLivro=estoqueLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public int getEstoqueLivro() {
        return estoqueLivro;
    }

    public void setEstoqueLivro(int estoqueLivro) {
        this.estoqueLivro = estoqueLivro;
    }

    @Override
    public String toString(){
        return "Livro: "+ nomeLivro+" | Código: "+ codigoLivro+" | Estoque: "+estoqueLivro;
    }
}