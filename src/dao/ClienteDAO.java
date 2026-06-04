package dao;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private List<Cliente> clientes= new ArrayList<>();

    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String cpf){
        return clientes.stream().filter(c->c.getCpf().equals(cpf)).findFirst().orElse(null);
    }

    public void listarClientes(){
        clientes.forEach(System.out::println);
    }

    public void removerCliente(String cpf){
        clientes.removeIf(c->c.getCpf().equals(cpf));
    }
}
