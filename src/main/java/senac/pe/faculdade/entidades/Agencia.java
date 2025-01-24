package senac.pe.faculdade.entidades;

public class Agencia {
    //atributos
    private int numero;
    private String nome;
    private int telefone;
    private String email;
    private Endereco endereco;

    //construtor
    public Agencia(int numero, String nome, int telefone, String email, Endereco endereco) {
        this.numero = numero;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Agencia(int numero, int telefone, String nome, Endereco endereco) {
        this.numero = numero;
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Agencia() {

    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Agencia: " + this.numero + " - " + this.nome + "\n" +
                "\tTelefone: " + this.telefone +
                (this.email != null ? " _ " + "Email" + this.email : "")
                + "\n" + "\t" + this.endereco.toString();
    }
}