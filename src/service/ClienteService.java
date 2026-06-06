package service;

import dao.ClienteDAO;
import exceptions.ClienteJaCadastradoException;
import exceptions.ClienteNaoEncontradoException;
import model.Cliente;

public class ClienteService {

    private ClienteDAO dao = new ClienteDAO();

    public void cadastrarCliente(String nome, String cpf){
        Cliente existente = dao.buscarCliente(cpf);
        if(existente!=null){
            throw new ClienteJaCadastradoException(cpf);
        }
        dao.cadastrarCliente(new Cliente(nome, cpf)
        );
    }

    public Cliente buscarCliente(String cpf){
        Cliente cliente = dao.buscarCliente(cpf);
        if(cliente==null){
            throw new ClienteNaoEncontradoException(cpf);
        }
        return dao.buscarCliente(cpf);
    }

    public void listarClientes(){
        dao.listarClientes();
    }

    public void removerCliente(String cpf){
        dao.removerCliente(cpf);
    }
}