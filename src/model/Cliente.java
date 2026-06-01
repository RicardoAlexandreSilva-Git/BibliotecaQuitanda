package model;

public class Cliente {
    private String nomeCliente;
    private Integer cpfCliente;

    public Cliente(String nomeCliente, String cpfCliente){
        this.cpfCliente=cpfCliente;
        this.nomeCliente=nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(Integer cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
}
