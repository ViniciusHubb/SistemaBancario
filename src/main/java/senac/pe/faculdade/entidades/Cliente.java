package senac.pe.faculdade.entidades;

import java.util.Date;

public class Cliente {
    //atributos
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Date dataNasc;
    private int rg;
    private String email;
    private String telefone;

    //construtor
    public Cliente(String nome, String cpf, Endereco endereco, Date dataNasc, int rg, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.email = email;
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpf, Endereco endereco, Date dataNasc, int rg, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.telefone = telefone;
    }

    public Cliente() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public int getRg() {
        return rg;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nome + "\n" +
                "\tCPF: " + this.cpf + "\n" + "\t" +
                "Nasc: " + this.dataNasc.toLocaleString() +
                "\n" + "\tRG: " + this.rg +
                "\n" + "\tTelefone: " + this.telefone + "\n" +
                (this.email != null ? "\tEmail: " + this.email : "")
                + "\n" + "\t" + this.endereco.toString();
    }
}