package main;

import exceptions.ClienteJaCadastradoException;
import exceptions.ClienteNaoEncontradoException;
import exceptions.LivroNaoEncontradoException;
import exceptions.LivroSemEstoqueException;
import model.Cliente;
import model.Livro;
import service.ClienteService;
import service.EmprestimoService;
import service.LivroService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ClienteService clienteService = new ClienteService();
        LivroService livroService = new LivroService();
        EmprestimoService emprestimoService = new EmprestimoService();

        boolean rodando = true;

        while (rodando) {

            System.out.println("\n=== LIVRARIA QUITANDA ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Livro");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Listar Livros");
            System.out.println("5 - Remover Livro");
            System.out.println("6 - Remover Cliente");
            System.out.println("7 - Emprestar Livro");
            System.out.println("8 - Devolver Livro");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = Integer.parseInt(s.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do cliente: ");
                        String nomeCliente = s.nextLine();
                        System.out.print("CPF: ");
                        String cpf = s.nextLine();
                        clienteService.cadastrarCliente(nomeCliente, cpf);
                        System.out.println("Cliente cadastrado com sucesso.");
                        break;

                    case 2:
                        System.out.print("Nome do livro: ");
                        String nomeLivro = s.nextLine();
                        System.out.print("Código do livro: ");
                        String codigoLivro = s.nextLine();
                        System.out.print("Quantidade em estoque: ");
                        int estoque = Integer.parseInt(s.nextLine());
                        livroService.cadastrarLivro(nomeLivro, codigoLivro, estoque);
                        System.out.println("Livro cadastrado com sucesso.");
                        break;

                    case 3:
                        clienteService.listarClientes();
                        break;

                    case 4:
                        livroService.listarLivros();
                        break;

                    case 5:
                        System.out.print("Informe o código do livro: ");
                        String codigoRemover = s.nextLine();
                        livroService.removerLivro(codigoRemover);
                        System.out.println("Livro removido.");
                        break;

                    case 6:
                        System.out.print("Informe o CPF do cliente: ");
                        String cpfRemover = s.nextLine();
                        clienteService.removerCliente(cpfRemover);
                        System.out.println("Cliente removido.");
                        break;

                    case 7:
                        System.out.print("CPF do cliente: ");
                        String cpfEmprestimo = s.nextLine();
                        Cliente cliente = clienteService.buscarCliente(cpfEmprestimo);
                        System.out.print("Código do livro: ");
                        String codigoEmprestimo = s.nextLine();
                        Livro livro = livroService.buscarLivro(codigoEmprestimo);
                        emprestimoService.emprestarLivro(cliente, livro);
                        break;

                    case 8:
                        System.out.print("Código do livro devolvido: ");
                        String codigoDevolucao = s.nextLine();
                        emprestimoService.devolverLivro(codigoDevolucao);
                        break;

                    case 9:
                        rodando = false;
                        System.out.println("Sistema encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números.");

            } catch (ClienteJaCadastradoException e) {
                System.out.println(e.getMessage());

            } catch (ClienteNaoEncontradoException e) {
                System.out.println(e.getMessage());

            } catch (LivroNaoEncontradoException e) {
                System.out.println(e.getMessage());

            } catch (LivroSemEstoqueException e) {
                System.out.println(e.getMessage());

            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
        s.close();
    }
}