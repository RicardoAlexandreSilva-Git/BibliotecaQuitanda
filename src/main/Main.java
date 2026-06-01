package main;

import service.ClienteService;
import service.LivroService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ClienteService clienteService= new ClienteService();
        LivroService livroService = new LivroService();

        boolean rodando = true;

        while(rodando){
            System.out.println("---Livraria Quitanda---");
            System.out.println("1-Cadastro cliente.");
            System.out.println("2-Cadastro livro.");
            System.out.println("3-Listar clientes.");
            System.out.println("4-Listar livros.");
            System.out.println("5-Remover livro");
            System.out.println("6-Remover cliente");
            System.out.println("7-Emprestar livro");
            System.out.println("8-Devolver livro");
            System.out.println("9-Sair");

            int opcao;

            try {

                opcao = Integer.parseInt(
                        s.nextLine()
                );

            switch(opcao){
                case 1:
                    System.out.println("Nome cliente:");
                    String nomeCliente=s.nextLine();
                    System.out.println("CPF cliente:");
                    String cpf=s.nextLine();
                    clienteService.cadastrarCliente(nomeCliente,cpf);
                    break;
                case 2:
                    System.out.println("Nome livro:");
                    String nomeLivro=s.nextLine();
                    System.out.println("Código livro:");
                    String codigo=s.nextLine();
                    livroService.cadastrarLivro(nomeLivro,codigo);
                    break;
                case 3:
                    clienteService.listarCliente();
                    break;
                case 4:
                    livroService.listarLivro();
                    break;
                case 5:
                    System.out.println("Informar código do livro a remover.");
                    String codigoRemover=s.nextLine();
                    livroService.removerLivro(codigoRemover);
                    break;

                case 6:
                    System.out.println("Informar cpf a remover.");
                    String cpfRemover=s.nextLine();
                    clienteService.removerCliente(cpfRemover);
                    break;

                case 7:
                    System.out.println("Informar qual CPF cliente:");
                    System.out.println("Informar código livro a emprestar.");
                    break;
                case 8:
                    System.out.println("Informar código livro devolvido.");
                    break;
                case 9:
                    rodando=false;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
            }
            catch (NumberFormatException e) {

                System.out.println("Digite apenas números.");

                continue;
            }
        }
        s.close();
    }
}
