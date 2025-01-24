package senac.pe.faculdade.entidades;

public class Endereco {
    //private: só a class consegue modificar o atributo;
    // public: outra classe consegue mudar os atributos por conta;
    // proctected: só quem tá na pasta do atributo consegue ver;
    private String rua;
    private String bairro;
    private String cidade;
    private String uf;
    private int numero;
    private String complemento;
    private String cep;

    //Construtor 1 (precisa de todos os atributos pra aceitar)
    public Endereco(String rua, String bairro, String cidade, String uf, int numero, String complemento, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    // Construtor 2 (n precisa informar todos os atributos no Main pra aceitar)
    public Endereco(String rua, String bairro, String cidade, String uf, int numero,
                    String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
        this.cep = cep;
    }

    //Construtor 3 (vazio caso n seja obrigado colocar informações)
    public Endereco() {
    }

    //criando os recursos para outras classes solicitarem informações e
    // modificar informações
    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public String toString() {
        return "Endereco: " +
                "rua='" + this.rua + '\'' +
                ", bairro='" + this.bairro + '\'' +
                ", cidade='" + this.cidade + '\'' +
                ", uf='" + this.uf + '\'' +
                ", numero=" + this.numero +
                ", complemento='" + this.complemento + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}