package dao;

import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
    private List<Livro> livros = new ArrayList<>();
    private Integer codigoLivro;
    public void cadastrarLivro(Livro novoLivro){
        Livro livroExistente = buscarLivro(novoLivro.getNomeLivro());

        if(livroExistente == null){livros.add(novoLivro);
            System.out.println("Livro cadastrado.");
        }
        else {livroExistente.setEstoqueLivro(livroExistente.getEstoqueLivro()+novoLivro.getEstoqueLivro());
            System.out.println("Quantidade atualizada.");
        }
    }

    public void listarLivro(){

    }

    public Livro buscarLivro(String nomeLivro){
    return livros.stream().filter(livro -> livro.getNomeLivro().equalsIgnoreCase(nomeLivro)).findFirst().orElse(null);
    }

    public void atualizarLivro(){

    }

    public void removerLivro(){

    }
}